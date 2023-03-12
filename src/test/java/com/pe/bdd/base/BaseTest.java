package com.pe.bdd.base;

import com.pe.bdd.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {
    public static Properties prop = new Properties();
    public static FileInputStream file;
    public static Response response;

    public static void initialization() {
        try {
            file = new FileInputStream(Constants.PROPERTIES_DIRECTORY);
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RestAssured.baseURI = prop.getProperty("test.base.url");
    }

}
