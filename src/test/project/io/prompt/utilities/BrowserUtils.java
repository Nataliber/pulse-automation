package io.prompt.utilities;

import org.junit.Assert;

public class BrowserUtils {


    public void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    public void verifyURL(String expectedURL){

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);

    }

}
