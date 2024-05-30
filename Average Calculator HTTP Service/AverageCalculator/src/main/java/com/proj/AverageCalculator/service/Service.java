package com.proj.AverageCalculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class Service {

    private final RestTemplate restTemplate;

    private final String baseUrl = "http://20.244.56.144/test/";
    private final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJNYXBDbGFpbXMiOnsiZXhwIjoxNzE3MDUzNjQ5LCJpYXQiOjE3MTcwNTMzNDksImlzcyI6IkFmZm9yZG1lZCIsImp0aSI6IjdkZGU1MWI4LTMzZmYtNDI4NC1hMTA4LTgyNDRkOTFiMzEyNyIsInN1YiI6Imtzc3JpcmFtbWFuaUBnbWFpbC5jb20ifSwiY29tcGFueU5hbWUiOiJNLmt1bWFyYXNhbXkgY29sbGVnZSBvZiBlbmdpbmVlcmluZyIsImNsaWVudElEIjoiN2RkZTUxYjgtMzNmZi00Mjg0LWExMDgtODI0NGQ5MWIzMTI3IiwiY2xpZW50U2VjcmV0IjoiWWJOREFlS3JPaGhZc0lFdiIsIm93bmVyTmFtZSI6IksuUy5TcmlyYW0iLCJvd25lckVtYWlsIjoia3NzcmlyYW1tYW5pQGdtYWlsLmNvbSIsInJvbGxObyI6IjkyNzYyMUJDQjA1MCJ9.C0kDomII85aKI0RwxQlcs7WU0_LgKLHCELe_3qJIYgY";

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        return headers;
    }

    private HttpEntity<String> createHttpEntity() {
        return new HttpEntity<>(createHeaders());
    }

    public String primes() {
        ResponseEntity<String> response = restTemplate.exchange(baseUrl + "primes", HttpMethod.GET, createHttpEntity(), String.class);
        return response.getBody();
    }

    public String fibonacci() {
        ResponseEntity<String> response = restTemplate.exchange(baseUrl + "fibo", HttpMethod.GET, createHttpEntity(), String.class);
        return response.getBody();
    }

    public String even() {
        ResponseEntity<String> response = restTemplate.exchange(baseUrl + "even", HttpMethod.GET, createHttpEntity(), String.class);
        return response.getBody();
    }

    public String random() {
        ResponseEntity<String> response = restTemplate.exchange(baseUrl + "rand", HttpMethod.GET, createHttpEntity(), String.class);
        return response.getBody();
    }
}
