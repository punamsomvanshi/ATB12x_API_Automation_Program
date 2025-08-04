package com.testingacdemy.sample;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {

        //https://api.postalpincode.in/pincode/413604
        //baseuri

        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/413604")

                .when()
                .get()


                .then()
                .log().all().statusCode(200);


    }
}
