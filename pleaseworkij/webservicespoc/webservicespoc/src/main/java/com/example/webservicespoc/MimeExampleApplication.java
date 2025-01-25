package com.example.webservicespoc;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SpringBootApplication
public class MimeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MimeExampleApplication.class, args);
    }
    
    @Bean
    public XmlMapper getxmlMapper()
    {
    	return new XmlMapper();
    }
}

@RestController
class MyController {

	@Autowired
	private XmlMapper xmlMapper;

	// 1. Returning JSON (application/json)
	@GetMapping("/getUser")
	public User getUser() {
		User user = new User(1, "xyz");
		return user; // Automatically converts to JSON (application/json)
	}

	// 2. Handling XML (application/xml)
	@GetMapping(value = "/getUserXml", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> getUserXml() {
		// Create a User object
		User user = new User(1, "John Doe");

		try {
			// Convert User object to XML using XmlMapper
			String userXml = xmlMapper.writeValueAsString(user);

			// Return ResponseEntity with XML string
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_XML).body(userXml);
		} catch (Exception e) {
			// Handle any exceptions related to XML conversion
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// 3. Accepting JSON and Returning JSON (application/json)
	@PostMapping(value = "/createUser", consumes = "application/json",produces = "text/json")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		// Process user object
		return ResponseEntity.ok(user);
	}

	// 4. Accepting and Returning HTML (text/html)
	@GetMapping(value = "/home", produces = "text/html")
	public String home(Model model) {
		model.addAttribute("message", "Welcome to the Spring Boot Application");
		return "home"; // Refers to a template (home.html)
	}

	// 5. Serving Image (image/png)
	@GetMapping(value = "/image", produces = "image/jpeg")
	public ResponseEntity<byte[]> getImage() throws IOException {

		// Path imagePath = Paths.get("src/main/java/ghosterror.jpg");
		// Resource resource = new FileSystemResource(imagePath);
		byte[] imageContent = Files.readAllBytes(Paths.get("src/main/java/ghosterror.jpg"));
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageContent);
	}

	// 6. Accepting File Upload (multipart/form-data)

	@PostMapping(value="/uploade",consumes = "multipart/form-data", produces = "text/json")
	public ResponseEntity<String> handleFileUpload(@RequestParam("freak") MultipartFile file) {
		// Validate file
		
		System.out.println(file.getOriginalFilename());
		if (file.isEmpty()) {
			return new ResponseEntity<>("No file uploaded", HttpStatus.BAD_REQUEST);
		}

		
		// Define the location to save the uploaded file
		String uploadDir = "uploads/"+ file.getOriginalFilename(); // You can specify a path
			
		Path rootLocation = Paths.get(uploadDir);
		Path destinationFile = rootLocation.resolve(
				Paths.get(file.getOriginalFilename()))
				.normalize().toAbsolutePath();
		
		
		try {
			file.transferTo(rootLocation);
			return new ResponseEntity<>("File uploaded successfully: " + file.getOriginalFilename(), HttpStatus.OK);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>("not uploaded " + file.getOriginalFilename(), HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>("not uploaded " + file.getOriginalFilename(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
		

		
	}

	// 7. Custom MIME Type (application/vnd.custom-type+json)
	@GetMapping(value = "/custom", produces = "application/vnd.custom-type+json")
	public ResponseEntity<Map<String, String>> getCustomData() {
		Map<String, String> data = new HashMap<>();
		data.put("key", "value");
		return ResponseEntity.ok(data);
	}

	// 8. Returning PDF (application/pdf)
	@GetMapping(value = "/pdf", produces = "application/pdf")
	public ResponseEntity<byte[]> getPdf() throws IOException {
		byte[] pdfContent = Files.readAllBytes(Paths.get("src/main/java/polya.pdf"));
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(pdfContent);
	}
}

@Controller
class HtmlController {

    // 9. Returning HTML content
    @GetMapping("/homePage")
    public String homePage(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Home Page!");
        return "home"; // This would map to home.html (Thymeleaf or other template engine)
    }
}

@JacksonXmlRootElement(localName = "user") 
class User {

	   @JsonProperty("id")
    private int id;
	   
	   @JsonProperty("name")
    private String name;

    // Constructors, getters, and setters
    public User() {}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
