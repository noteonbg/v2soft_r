package com.clients;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateExampleService {
	private final RestTemplate restTemplate;

	public RestTemplateExampleService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	// GET
	public String getExampleData(String url) {
		return restTemplate.getForObject(url, String.class);
	}

	// POST
	public String createData(String url, Object requestData) {
		HttpEntity<Object> request = new HttpEntity<>(requestData);
		return restTemplate.postForObject(url, request, String.class);
	}

	// PUT
	public void updateData(String url, Object requestData) {
		HttpEntity<Object> request = new HttpEntity<>(requestData);
		restTemplate.put(url, request);
	}

	// DELETE
	public void deleteData(String url) {
		restTemplate.delete(url);
	}
}
