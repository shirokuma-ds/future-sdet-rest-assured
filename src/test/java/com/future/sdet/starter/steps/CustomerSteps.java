package com.future.sdet.starter.steps;

import com.future.sdet.starter.controllers.CustomerController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CustomerSteps {

    @Steps
    CustomerController customerController;

    List<Map<String, String>> customerRecords;

    @Given("have the following customer data:")
    public void have_the_following_customer_data(List<Map<String, String>> customerRecords) throws IOException {
        this.customerRecords = customerRecords;
    }

    @When("register all the customers")
    public void register_all_the_customers() {
        customerController.registerCustomer(customerRecords);
    }
}
