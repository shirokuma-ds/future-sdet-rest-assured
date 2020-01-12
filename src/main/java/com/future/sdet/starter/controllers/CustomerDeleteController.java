package com.future.sdet.starter.controllers;

import com.future.sdet.starter.beans.CustomerRegistration;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
@Api("customerDelete")
public class CustomerDeleteController {

    @RequestMapping(method = DELETE, value = "/delete/customer")
    @ApiOperation("Delete a customer record based on id")
    @ResponseBody
    public String deleteCustomerRecord(@RequestParam String id) {
        System.out.println("Deleting customer record");
        return CustomerRegistration.getInstance().deleteCustomer(id);
    }

}
