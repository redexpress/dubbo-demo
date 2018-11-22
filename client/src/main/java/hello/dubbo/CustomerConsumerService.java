package hello.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import hello.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConsumerService {

    @Reference(version = "1")
    CustomerService cityDubboService;

    public void printName() {
        System.out.println(cityDubboService);
        Customer customer = cityDubboService.findByName("yang");
        System.out.println(customer.getName());
    }
}
