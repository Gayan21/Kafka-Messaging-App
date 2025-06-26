package com.example.kafkademo;

import com.example.kafkademo.service.KafkaProducerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication implements CommandLineRunner {

    private final KafkaProducerService kafkaProducerService;

    public KafkaDemoApplication(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        kafkaProducerService.sendMessage("Hello, Kafka!");
    }
}

