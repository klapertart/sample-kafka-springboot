package klapertart.lab.kafk.kafka;

import klapertart.lab.kafk.data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "topic-spring", groupId = "myGrup")
    private void consume(User user){
        log.info("Message receive >> {}",user.toString());
        log.info("Message (FirstName) receive >> {}",user.getFirstName());
        log.info("Message (LastName) receive >> {}",user.getLastName());
    }

}
