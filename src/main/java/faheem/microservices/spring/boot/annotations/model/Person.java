package faheem.microservices.spring.boot.annotations.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person { //it should be component if u want to use configurationProperties annotation

    private String firstName;
    private String lastName;
    private Integer age;
}
