package com.future.sdet.starter.controllers;

import com.future.sdet.starter.WebServiceEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerController {

    @Step
    public void registerCustomer(List<Map<String, String>> customerRecords) {

        for(Map<String, String> customerRecord : customerRecords) {
            JSONObject requestParams = new JSONObject();

            requestParams.putAll(customerRecord);

            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(requestParams)
                    .when()
                    .post(WebServiceEndPoints.CUSTOMER_ADD.getUrl());

            response.getBody().prettyPrint();
        }
    }

}
