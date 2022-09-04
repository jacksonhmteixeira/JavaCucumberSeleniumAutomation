package br.com.jackson;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "not @ignore",
        glue = {"br.com.jackson.steps", "br.com.jackson.hooks"},
        plugin = {"pretty"},
        publish = true
)
public class Runner {
}
