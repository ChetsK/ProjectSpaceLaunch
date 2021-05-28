package TestScripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS03_StatusCode {

    Response response = RestAssured.get("https://api.spacexdata.com/v4/launches/latest");

    @Test
    public void testStatus() {

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

}
