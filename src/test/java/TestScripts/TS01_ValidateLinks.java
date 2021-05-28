package TestScripts;

import SpaceLaunchGet.dto.FairingsDTO;
import SpaceLaunchGet.dto.SpaceLaunchGetDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import apiCalls.SpaceLaunchGet;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class TS01_ValidateLinks {

    SpaceLaunchGet spaceLaunchGet = new SpaceLaunchGet();
    String getWebCased;
    String id ;

    @Test
    public void validateFairingsResponse() {

        SpaceLaunchGetDTO spaceLaunchGetDTOpaceLaunchGetDTO = spaceLaunchGet.getResponse();
        getWebCased= spaceLaunchGetDTOpaceLaunchGetDTO.getLinks().getWebcast();
        id = spaceLaunchGetDTOpaceLaunchGetDTO.getLinks().getYoutubeId();

        Assert.assertEquals(getWebCased,"https://youtu.be/xRu-ekesDyY");
        Assert.assertEquals(id,"xRu-ekesDyY");
    }



}





