package klapertart.lab.kafk.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Getter
@Setter
@ConfigurationProperties("application")
public class KafkaProperties {
    private String kafkaGroup;
    private String kafkaTopic;
}
