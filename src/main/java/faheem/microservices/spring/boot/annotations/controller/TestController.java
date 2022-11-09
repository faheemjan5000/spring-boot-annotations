package faheem.microservices.spring.boot.annotations.controller;

import faheem.microservices.spring.boot.annotations.entity.LazyLoadingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private LazyLoadingBean lazyLoadingBean;
}
