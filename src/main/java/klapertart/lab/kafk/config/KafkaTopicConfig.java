package klapertart.lab.kafk.config;

import klapertart.lab.kafk.data.KafkaProperties;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Configuration
public class KafkaTopicConfig {

    @Autowired
    private KafkaProperties kafkaProperties;

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder
                .name(kafkaProperties.getKafkaTopic())
                .build();
    }
}
