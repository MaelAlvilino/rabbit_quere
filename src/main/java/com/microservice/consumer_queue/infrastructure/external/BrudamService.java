package com.microservice.consumer_queue.infrastructure.external;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microservice.consumer_queue.interfaces.dtoBrudam.Docs;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

@AllArgsConstructor
@Component
@NoArgsConstructor
public class BrudamService {
    @Value("${api.url}")
    private String API_URL;

    @Value("${api.endpoints.auth}")
    private String API_END_POINT_AUTH;

    @Value("${api.endpoints.coleta}")
    private String API_END_POINT_COLETA;

    @Value("${usuario}")
    private String USUARIO_BRUDAM;

    @Value("${senha}")
    private String SENHA_BRUDAM;

    private String AUTH_TOKEN = "";



    public String authenticate() {
        String jsonRequest = String.format("{\"usuario\":\"%s\", \"senha\":\"%s\"}", USUARIO_BRUDAM, SENHA_BRUDAM);

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonRequest, headers);

        var restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(API_URL+API_END_POINT_AUTH, HttpMethod.POST,
            requestEntity, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            String responseBody = responseEntity.getBody();
            assert responseBody != null;
            return extractToken(responseBody);
        } else {
            System.err.println("Problem with the authentication: " + responseEntity.getStatusCode().value());
            return null;
        }
    }

    private String extractToken(String responseBody) {
        try {
            var objectMapper = new ObjectMapper();
            var responseJson = objectMapper.readTree(responseBody);

            return responseJson.get("data").get("access_key").asText();
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public void coleta(Docs source) {
        if (AUTH_TOKEN == null || AUTH_TOKEN.isEmpty()) {
            AUTH_TOKEN = authenticate();
        }

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(AUTH_TOKEN);

        HttpEntity<Docs> requestEntity = new HttpEntity<>(source, headers);

        var restTemplate = new RestTemplate();
        var responseEntity = restTemplate.exchange(API_URL + API_END_POINT_COLETA,
                HttpMethod.POST,
                requestEntity, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println(responseEntity.getBody());
        } else if (responseEntity.getStatusCode() == HttpStatus.UNAUTHORIZED ||
                responseEntity.getStatusCode() == HttpStatus.FORBIDDEN) {
            authenticate();
            coleta(source);
        } else {
            System.err.println("Problem with the request: " + responseEntity.getStatusCode().value());
        }
    }
}
