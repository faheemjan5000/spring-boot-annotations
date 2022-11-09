package faheem.microservices.spring.boot.annotations.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Data
public class DatabaseConfig {
    @Value("${db.driverclass}")
    private String driverClass;
    @Value("${db.url}")
    private String url;
    @Value("${db.uername}")
    private String username;
    @Value("${db.password}")
    private String password;

   @Bean
    @Profile("dev")
    public String dataSourceProps(){
        System.out.println(driverClass +" "+url+" "+username+" "+password);
        return "dataSource connection for dev";
    }
}
