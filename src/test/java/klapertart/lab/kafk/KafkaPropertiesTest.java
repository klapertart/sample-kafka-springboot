package klapertart.lab.kafk;

import klapertart.lab.kafk.data.KafkaProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@SpringBootTest
public class KafkaPropertiesTest {

    @Autowired
    private KafkaProperties properties;

    @Test
    void name() {
        Assertions.assertEquals("myGrup",properties.getKafkaGroup());
        Assertions.assertEquals("topic-spring",properties.getKafkaTopic());
    }
}
