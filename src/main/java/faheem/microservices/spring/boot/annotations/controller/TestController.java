package faheem.microservices.spring.boot.annotations.controller;

import faheem.microservices.spring.boot.annotations.model.Mail;
import faheem.microservices.spring.boot.annotations.model.MailProps;
import faheem.microservices.spring.boot.annotations.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
@Slf4j
@PropertySource("classpath:mail.properties") // that's how we tell to spring boot which properties file is to use.
@Scope("prototype") //it will create only one instance of this class if its "singleton" but for "prototype" it creates based on how many time you call it.
public class TestController {

    @Value("${mail.from}")
   private String from;

    @Value("${mail.host}")
   private String host;

    @Value("${mail.port}")
   private String port;

    @Autowired
    private Mail mail;

    @Autowired
    private Person person;

    public TestController(){
        System.out.println("TestConrtoller object created!");
    }


    @RequestMapping("/print")
    public MailProps printProperties(){
        System.out.println("From : "+from +" Host : "+host + " port : "+port);
        MailProps mailProps = new MailProps();

        mailProps.setFrom(from);
        mailProps.setHost(host);
        mailProps.setPort(port);
        log.info("mailProps values : {} ",mailProps);
        return mailProps;
    }

    @RequestMapping("/printMail")
    public Mail printAllProperties(){

        System.out.println("mail : "+mail);
        log.info("mail values read from properties file : {} ",mail);
        return mail;
    }

    @RequestMapping("/printPerson")
    public Person printPersonFromPropertiesFile(){

        log.info("person values read from properties file : {} ",person);
        return person;
    }
}
