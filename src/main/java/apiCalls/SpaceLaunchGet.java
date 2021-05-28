package apiCalls;

import SpaceLaunchGet.dto.SpaceLaunchGetDTO;
import Utils.Constant;
import Utils.RestApiCall;
import com.google.gson.Gson;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.testng.Assert;

public class SpaceLaunchGet {

    public SpaceLaunchGetDTO getResponse() {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri(Constant.Host_Stage);
        builder.setBasePath(Constant.URL);


        RestApiCall restApiCall = new RestApiCall(builder);
        Response response = restApiCall.getCall();

        String responseBody = response.getBody().asString();
        Assert.assertEquals(response.statusCode(), 200, response.getBody().asString());
        SpaceLaunchGetDTO spaceLaunchGetDTO = new Gson().fromJson(responseBody, SpaceLaunchGetDTO.class);
        return spaceLaunchGetDTO;
    }


}
