package com.rsp.openbankingpart1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TransactionComponentTest {


    @BeforeEach
    void setUp() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;
    }

    @Test
    void testTransactionComponent() {
        Response response =  given().
                contentType("application/json").
                accept("application/json").
                when().
                get("/transactions?accountNumber=222").
                then().
                statusCode(200).
                extract().
                response();

        Assertions.assertTrue(response.body().prettyPrint().contains("Kohls"));
    }


}
