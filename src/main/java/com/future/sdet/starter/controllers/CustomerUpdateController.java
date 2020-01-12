package com.future.sdet.starter.controllers;

import com.future.sdet.starter.beans.Customer;
import com.future.sdet.starter.beans.CustomerRegistration;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@Api("customerUpdate")
public class CustomerUpdateController {

    @RequestMapping(method = PUT, value = "/update/customer")
    @ApiOperation("Update a customer data")
    @ResponseBody
    public String updateCustomerRecord(@RequestBody Customer customer) {
        System.out.println("Updating customer record");
        return CustomerRegistration.getInstance().updateCustomer(customer);
    }
}
