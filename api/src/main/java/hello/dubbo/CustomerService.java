package hello.dubbo;

import hello.domain.Customer;

public interface CustomerService {
    Customer findByName(String name);
}
