package com.future.sdet.starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "classpath:features",
        tags = {"@InsertAndGetCustomerFeature"}
)
public class CucumberRunner {
}
