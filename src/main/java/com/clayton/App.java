package com.clayton;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();

    }

  }

