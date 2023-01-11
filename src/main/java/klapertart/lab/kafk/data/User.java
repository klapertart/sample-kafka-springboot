package klapertart.lab.kafk.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author kurakuraninja
 * @since 11/01/23
 */

@Data
public class User {
    private String id;
    private String firstName;
    private String lastName;
}
