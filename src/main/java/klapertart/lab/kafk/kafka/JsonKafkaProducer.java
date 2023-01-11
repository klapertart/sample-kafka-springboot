package klapertart.lab.kafk.kafka;

import klapertart.lab.kafk.data.KafkaProperties;
import klapertart.lab.kafk.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Service
public class JsonKafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private KafkaProperties kafkaProperties;

    public void sendMessage(User user){
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, kafkaProperties.getKafkaTopic())
                .build();

        kafkaTemplate.send(message);
    }
}
