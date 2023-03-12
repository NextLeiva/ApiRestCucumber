package com.pe.bdd.api;

import com.pe.bdd.base.BaseTest;
import com.pe.bdd.pojo.Persona;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PersonApi {
    public static String id;

    public static Response createPerson(String name, String email, String phone) {
        int numero = (int) (Math.random() * 10 + 1);
        Persona persona = new Persona();
        persona.setId(numero);
        persona.setNombre(name);
        persona.setEmail(email);
        persona.setPhone(phone);
        BaseTest.response = given().log().all().contentType(ContentType.JSON).and()
                .body(persona).post("/ws/persona/guardar");
        BaseTest.response.then().log().all();
        id = BaseTest.response.jsonPath().getString("id");
        return BaseTest.response;
    }

    public static Response updatePerson(String name, String email, String phone) {
        Persona persona = new Persona();
        persona.setNombre(name);
        persona.setEmail(email);
        persona.setPhone(phone);
        BaseTest.response = given().log().all().contentType(ContentType.JSON).and()
                .pathParam("id", id).body(persona).put("/ws/persona/actualizar/{id}");
        BaseTest.response.then().log().all();
        return BaseTest.response;
    }
}
