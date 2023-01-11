package klapertart.lab.kafk.kafka;

import klapertart.lab.kafk.data.KafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "topic-spring", groupId = "myGrup")
    public void receiveMessage(String message){
        log.info("Receive message >> {}", message);
    }
}
