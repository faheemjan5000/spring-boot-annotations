package faheem.microservices.spring.boot.annotations.entity;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //this component wont be created automatically by spring boot. it will only be created when used @Autowired annotation somewhere
public class LazyLoadingBean {

    public LazyLoadingBean(){
        System.out.println("lazy loading bean created on demand!");
    }
}
