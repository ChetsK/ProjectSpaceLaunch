package TestScripts;

import SpaceLaunchGet.dto.FairingsDTO;
import SpaceLaunchGet.dto.SpaceLaunchGetDTO;
import apiCalls.SpaceLaunchGet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TS02_ValidateSpaceAttributes {

    SpaceLaunchGet spaceLaunchGet = new SpaceLaunchGet();
    String luanchPad ;
    String name;
    String id;
    @Test
    public void validateSpaceResponse() {


        SpaceLaunchGetDTO spaceLaunchGetDTOpaceLaunchGetDTO = spaceLaunchGet.getResponse();
        luanchPad= spaceLaunchGetDTOpaceLaunchGetDTO.getLaunchpad();
        name = spaceLaunchGetDTOpaceLaunchGetDTO.getName();
        id = spaceLaunchGetDTOpaceLaunchGetDTO.getId();

        Assert.assertEquals(luanchPad,"5e9e4501f509094ba4566f84");
        Assert.assertEquals(name,"Starlink-28 (v1.0)");
        Assert.assertEquals(id,"6079bd399a06446e8c61bf77");

    }

}
