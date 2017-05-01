package org.micro.service.web;

import org.micro.service.domain.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jachavez on 5/1/17.
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerWebService {

    @RequestMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") Long id) {
        return new Customer();
    }

}
