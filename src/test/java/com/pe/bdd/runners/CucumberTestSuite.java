package com.pe.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/persona.feature"}, glue = {"com.pe.bdd.stepsdefinitions"}
        , plugin = {"json:target/build/cucumber.json"})
public class CucumberTestSuite {
}
