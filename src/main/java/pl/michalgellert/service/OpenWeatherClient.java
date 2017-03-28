package pl.michalgellert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by micha on 16.03.2017.
 */
@Service
public class OpenWeatherClient {

    String url = "http://api.fixer.io/latest?symbols=USD,GBP";

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Bean
//    public String getExchange() {
//        Map<String, Object> response = restTemplate.getForObject(url, HashMap.class);
//        return response.toString();
//    }
}
