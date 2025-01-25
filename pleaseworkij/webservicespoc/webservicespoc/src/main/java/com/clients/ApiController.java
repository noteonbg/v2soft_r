package com.clients;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final RestTemplateExampleService restTemplateService;
    private final WebClientExampleService webClientService;
    private RestClientExampleService restClientService;
    

    public ApiController(RestTemplateExampleService restTemplateService, WebClientExampleService webClientService) {
        this.restTemplateService = restTemplateService;
        this.webClientService = webClientService;
    }

    @GetMapping("/resttemplate/get")
    public String getWithRestTemplate() {
        return restTemplateService.getExampleData("https://jsonplaceholder.typicode.com/posts/1");
    }

    @PostMapping("/resttemplate/post")
    public String postWithRestTemplate() {
        return restTemplateService.createData("https://jsonplaceholder.typicode.com/posts", new PostRequest("Title", "Body"));
    }

    @PutMapping("/resttemplate/put")
    public void putWithRestTemplate() {
        restTemplateService.updateData("https://jsonplaceholder.typicode.com/posts/1", new PostRequest("Updated Title", "Updated Body"));
    }

    @DeleteMapping("/resttemplate/delete")
    public void deleteWithRestTemplate() {
        restTemplateService.deleteData("https://jsonplaceholder.typicode.com/posts/1");
    }

    @GetMapping("/webclient/get")
    public String getWithWebClient() {
        return webClientService.getExampleData("/posts/1");
    }

    @PostMapping("/webclient/post")
    public String postWithWebClient() {
        return webClientService.createData("/posts", new PostRequest("Title", "Body"));
    }

    @PutMapping("/webclient/put")
    public void putWithWebClient() {
        webClientService.updateData("/posts/1", new PostRequest("Updated Title", "Updated Body"));
    }

    @DeleteMapping("/webclient/delete")
    public void deleteWithWebClient() {
        webClientService.deleteData("/posts/1");
    }
    

    @GetMapping("/{id}")
    public String getPost(@PathVariable int id) {
        return restClientService.getExampleData(id);
    }

    @PostMapping
    public String createPost(@RequestBody PostRequest request) {
        return restClientService.createData(request);
    }

    @PutMapping("/{id}")
    public void updatePost(@PathVariable int id, @RequestBody PostRequest request) {
    	restClientService.updateData(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {
    	restClientService.deleteData(id);
    }
}