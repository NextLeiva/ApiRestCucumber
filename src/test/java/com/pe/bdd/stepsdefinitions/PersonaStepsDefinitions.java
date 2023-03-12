package com.pe.bdd.stepsdefinitions;

import com.pe.bdd.api.PersonApi;
import com.pe.bdd.base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PersonaStepsDefinitions {

    @Before
    public void setUp() {
        BaseTest.initialization();
    }

    @When("^yo envio los datos de la persona (.*), (.*) y (.*)$")
    public void yoEnvioLosDatosDeLaPersona(String name, String email, String phone) {
        PersonApi.createPerson(name, email, phone);
    }

    @Then("^yo verifico el estado (.*)$")
    public void yoVerificoElEstado(int status) {
        Assert.assertEquals(BaseTest.response.statusCode(), status);
    }

    @And("^yo verifico los datos (.*), (.*) y (.*)$")
    public void yoVerificoLosDatosNombreEmailYPhone(String name, String email, String phone) {
        Assert.assertEquals(BaseTest.response.jsonPath().getString("nombre"), name);
        Assert.assertEquals(BaseTest.response.jsonPath().getString("email"), email);
        Assert.assertEquals(BaseTest.response.jsonPath().getString("phone"), phone);
    }

    @When("^yo actualizo los datos (.*), (.*) y (.*) de la persona$")
    public void yoActualizoLosDatosNombreEmailYPhoneDeLaPersona(String name, String email, String phone) {
        PersonApi.updatePerson(name, email, phone);
    }
}
