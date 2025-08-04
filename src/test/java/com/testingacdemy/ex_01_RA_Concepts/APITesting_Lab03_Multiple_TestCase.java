package com.testingacdemy.ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab03_Multiple_TestCase {
    public static void main(String[] args) {
        String pincode = "400709";

        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/400709")

                .when()
                .get()

                .then()
                .log().all().statusCode(200);

        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
