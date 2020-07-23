package package_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration // spring boot's annotation
public class Example {

    @RequestMapping("/")
    String home() {
        return "hello world!!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}