package faheem.microservices.spring.boot.annotations.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mail")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {

    private String from;
    private String host;
    private String port;
}
