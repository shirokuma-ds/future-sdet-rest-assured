package com.future.sdet.starter.controllers;

import com.future.sdet.starter.beans.Customer;
import com.future.sdet.starter.beans.CustomerRegistration;
import com.future.sdet.starter.beans.CustomerRegistrationReply;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@Api("customerRegistration")
public class CustomerRegistrationController {

    @RequestMapping(method = POST, value = "/register/customer")
    @ApiOperation("Register new customer")
    @ResponseBody
    public CustomerRegistrationReply registerCustomer(@RequestBody Customer customer) {
        CustomerRegistrationReply custRegReply = new CustomerRegistrationReply();

        custRegReply.setId(customer.getId());
        custRegReply.setUsername(customer.getUsername());
        custRegReply.setPassword(customer.getPassword());
        custRegReply.setAddress(customer.getAddress());
        custRegReply.setAge(customer.getAge());

        if(!CustomerRegistration.getInstance().isCustomerExist(customer)) {
            CustomerRegistration.getInstance().addCustomer(customer);

            custRegReply.setRegistrationStatus("Successful");
        } else {
            custRegReply.setRegistrationStatus("Failed. Customer id already exist");
        }

        return custRegReply;
    }

}
