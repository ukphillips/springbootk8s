package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@RestController
public class HelloController {
    @Autowired
    private Environment env;  

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Your secret is " + System.getenv("ENV_SECRET");
    }
    
}
