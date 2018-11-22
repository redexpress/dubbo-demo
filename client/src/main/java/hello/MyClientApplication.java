package hello;

import hello.domain.Customer;
import hello.dubbo.CustomerConsumerService;
import hello.dubbo.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyClientApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyClientApplication.class, args);
        CustomerConsumerService service = run.getBean(CustomerConsumerService.class);
        service.printName();
    }
}
