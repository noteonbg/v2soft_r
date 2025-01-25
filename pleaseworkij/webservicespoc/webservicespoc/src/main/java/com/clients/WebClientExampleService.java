package com.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientExampleService {
    private final WebClient webClient;

    public WebClientExampleService(WebClient webClient) {
        this.webClient = webClient;
    }

    // GET
    public String getExampleData(String endpoint) {
        return webClient.get()
                .uri(endpoint)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Synchronous, avoid in reactive environments
    }

    // POST
    public String createData(String endpoint, Object requestData) {
        return webClient.post()
                .uri(endpoint)
                .bodyValue(requestData)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Synchronous, avoid in reactive environments
    }

    // PUT
    public void updateData(String endpoint, Object requestData) {
        webClient.put()
                .uri(endpoint)
                .bodyValue(requestData)
                .retrieve()
                .toBodilessEntity()
                .block(); // Synchronous, avoid in reactive environments
    }

    // DELETE
    public void deleteData(String endpoint) {
        webClient.delete()
                .uri(endpoint)
                .retrieve()
                .toBodilessEntity()
                .block(); // Synchronous, avoid in reactive environments
    }
}

