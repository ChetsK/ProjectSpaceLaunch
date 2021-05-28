package Utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiCall {

    RequestSpecification requestSpecification;


    public RestApiCall (RequestSpecBuilder builder)
    {

        requestSpecification = RestAssured.given().spec(builder.build());
    }

    public Response getCall (){
        Response response = requestSpecification.request(Method.GET);
        return response;
    }
}

