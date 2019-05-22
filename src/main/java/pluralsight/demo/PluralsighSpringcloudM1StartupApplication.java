package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PluralsighSpringcloudM1StartupApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluralsighSpringcloudM1StartupApplication.class, args);
    }
    @RequestMapping(value="/greeting")
    public String sayHello() {
        return "hello form spring boot";
    }

}
