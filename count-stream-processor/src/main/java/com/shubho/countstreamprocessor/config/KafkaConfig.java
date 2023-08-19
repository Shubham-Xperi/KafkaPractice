package com.shubho.countstreamprocessor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class KafkaConfig {
    @Value(value = "${spring.kafka.bootstrap-server}")
    private static final String BOOTSTRAP_SERVER;
}
