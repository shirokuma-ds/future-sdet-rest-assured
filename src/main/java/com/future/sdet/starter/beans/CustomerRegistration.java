package com.future.sdet.starter.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CustomerRegistration {

    private List<Customer> customerRecords;

    private static CustomerRegistration instance;

    private CustomerRegistration() {
        customerRecords = new ArrayList<Customer>();
    }

    public static CustomerRegistration getInstance() {

        if(instance == null) {
            instance = new CustomerRegistration();
            return instance;
        } else {
            return instance;
        }
    }

    public void addCustomer(Customer customer) {
        customerRecords.add(customer);
    }

    public boolean isCustomerExist(Customer customer) {
        String id = customerRecords.stream()
                .filter(c -> c.getId().equals(customer.getId()))
                .findAny()
                .map(Customer::getId)
                .orElse("");

        return (id.isEmpty()) ? false : true;
    }

    public String updateCustomer(Customer customer) {

        for(int i=0; i<customerRecords.size(); i++) {
            Customer cust = customerRecords.get(i);
            if(cust.getId().equals(customer.getId())) {
                customerRecords.set(i, customer);
                return "Update successful";
            }
        }

        return "Update failed. Customer id not found";
    }

    public String deleteCustomer(String id) {

        for(int i=0; i<customerRecords.size(); i++) {
            Customer cust = customerRecords.get(i);
            if(cust.getId().equals(id)) {
                customerRecords.remove(i);
                return "Delete successful";
            }
        }

        return "Delete failed. Customer id not found";
    }

    public List<Customer> getCustomerRecords() {
        return customerRecords;
    }

    public Customer getCustomer(String id) {
        Optional<Customer> customer = customerRecords.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();

        return (customer.isPresent()) ? customer.get() : new Customer();
    }

}
