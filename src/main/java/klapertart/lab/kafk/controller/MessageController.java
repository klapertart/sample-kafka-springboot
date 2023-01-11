package klapertart.lab.kafk.controller;

import klapertart.lab.kafk.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    //--- http://localhost:8080/api/v1/kafka/publish?message={message}
    @GetMapping(path = "/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("Message sent to topic");
    }
}
