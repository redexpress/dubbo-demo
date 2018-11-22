package hello.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import hello.domain.Customer;

@Service(version = "1")
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer findByName(String name) {
        return new Customer("yang");
    }
}
