package faheem.microservices.spring.boot.annotations.entity;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

    public EagerLoadingBean(){
        System.out.println("eager loading bean created automatically!");
    }
}
