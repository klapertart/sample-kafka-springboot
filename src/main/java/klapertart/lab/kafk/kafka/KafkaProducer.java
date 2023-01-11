package klapertart.lab.kafk.kafka;

import klapertart.lab.kafk.data.KafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private KafkaProperties kafkaProperties;

    public void sendMessage(String message){
        log.info("Message sent {} ", message);
        kafkaTemplate.send(kafkaProperties.getKafkaTopic(),message);
    }
}
