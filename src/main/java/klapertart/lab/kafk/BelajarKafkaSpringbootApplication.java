package klapertart.lab.kafk;

import klapertart.lab.kafk.data.KafkaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		KafkaProperties.class
})
public class BelajarKafkaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarKafkaSpringbootApplication.class, args);
	}

}
