package faheem.microservices.spring.boot.annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailProps {

    private String from;
    private String host;
    private String port;
}
