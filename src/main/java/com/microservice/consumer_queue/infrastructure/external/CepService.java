package com.microservice.consumer_queue.infrastructure.external;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CepService {

    public String handleCepInformation(String cep) {
        String VIA_CEP_URL = "https://viacep.com.br/ws/";
        String apiUrl = VIA_CEP_URL + cep + "/json";

    var restTemplate = new RestTemplate();
    ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
        String.class);

    if (responseEntity.getStatusCode().is2xxSuccessful()) {
      String responseBody = responseEntity.getBody();
      assert responseBody != null;
      return extractIbgeCode(responseBody);
    } else {
      System.err.println("Problem with the request: " + responseEntity.getStatusCode().value());
      return null;
    }
  }

  private String extractIbgeCode(String responseBody) {
    try {
      var objectMapper = new ObjectMapper();
      var responseJson = objectMapper.readTree(responseBody);

      return responseJson.get("ibge").asText();
    } catch (JsonProcessingException e) {
      return null;
    }
  }
}
