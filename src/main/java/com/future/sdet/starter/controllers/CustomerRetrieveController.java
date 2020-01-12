package com.future.sdet.starter.controllers;

import com.future.sdet.starter.beans.Customer;
import com.future.sdet.starter.beans.CustomerRegistration;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Api("customerRetrieve")
public class CustomerRetrieveController {

    @RequestMapping(method = GET, value = "/customer/allcustomer")
    @ApiOperation("Get all customers")
    @ResponseBody
    public List<Customer> getAllCustomers() {
        return CustomerRegistration.getInstance().getCustomerRecords();
    }

    @RequestMapping(method = GET, value = "/customer/{id}")
    @ApiOperation("Get customer record by id")
    @ResponseBody
    public Customer getCustomer(@PathVariable("id") String id) {
        return CustomerRegistration.getInstance().getCustomer(id);
    }
}
