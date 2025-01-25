package com.clients;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

public class RestClientExampleService {
	
	private final RestClient restClient;

    public RestClientExampleService(RestClient restClient) {
        this.restClient = restClient;
    }

    // GET
    public String getExampleData(int id) {
        try {
            return restClient.get()
                    .uri("/posts/{id}", id)
                    .retrieve().body(String.class);
        } catch (HttpClientErrorException e) {
            throw new RuntimeException("Error fetching data: " + e.getMessage());
        }
    }

    // POST
    public String createData(PostRequest request) {
        return restClient.post()
                .uri("/posts")
                .body(request)
                .retrieve()
                .body(String.class);
                //.retrieve.body(String.class);
    }

    // PUT
    public void updateData(int id, PostRequest request) {
        restClient.put()
                .uri("/posts/{id}", id)
                .body(request)
                .retrieve();
    }

    // DELETE
    public void deleteData(int id) {
        restClient.delete()
                .uri("/posts/{id}", id)
                .retrieve();
    }

}
