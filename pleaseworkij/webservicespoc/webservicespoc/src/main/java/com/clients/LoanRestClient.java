package com.clients;

import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import anothervalidationexample.Loan;

public class LoanRestClient {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate =new RestTemplate();
		final String LOAN_API_URL = "http://localhost:8080/loan/create";
		Loan loan =new Loan(1,"A",3);
		String y = restTemplate.
				postForObject(LOAN_API_URL, loan, String.class);
		System.out.println(y);
		

	}
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		RestClient rs=RestClient.create();
		final String LOAN_API_URL = "http://localhost:8080/loan/create";
		Loan loan =new Loan();
		String y = rs.post().uri(LOAN_API_URL).
				body(loan).retrieve().body(String.class);
		System.out.println(y);
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebClient webclient = WebClient.create();
		final String LOAN_API_URL = "http://localhost:8080/loan/create";
		Loan loan =new Loan();
		String y = webclient.post().uri(LOAN_API_URL).bodyValue(loan).retrieve().bodyToMono(String.class).block();
		System.out.println(y);
		

	}

	
	
	
	
	

}
