package com.allstate.controllers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Sql(value = {"/clean-database-clients.sql"})
public class ClientsControllerTest {
    @Before
    public void setUp() throws Exception {
        RestAssured.port = 8001;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    // GET /api/clients
    public void shouldGetAllClients() throws Exception {
        get("/api/clients")
                .then()
                .statusCode(200)
                .body("numberOfElements", is(5));
    }

    @Test
    // GET /api/clients/:id
    public void shouldGetASingleClient() throws Exception {
        get("/api/clients/1")
                .then()
                .statusCode(200)
                .body("name", is("Bob"));
    }

    @Test
    // POST /api/clients
    public void shouldCreateaClient() throws Exception {
        Map<String, Object> json = new HashMap<>();
        json.put("name", "Rob");
        json.put("payment", "75");
        json.put("age", "25");
        json.put("gender", "M");

        given().
                contentType(ContentType.JSON).
                body(json).
                when().
                post("/api/clients")
                .then()
                .statusCode(200)
                .body("id", is(9));
    }
//    @Test
//    // GET /api/clients/:id/cars
//    public void shouldGetAllCarsForAClient() throws Exception {
//        get("/api/clients/1/cars")
//                .then()
//                .statusCode(200)
//                .body("numberOfElements", is(2));
//    }

}