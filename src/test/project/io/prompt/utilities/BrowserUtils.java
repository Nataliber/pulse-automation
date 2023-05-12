package io.prompt.utilities;

import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
 This method will accept int (in seconds) and execute Thread.sleep
 for given duration
  */
    public void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    public void time(int time) {

       Driver.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */
    public void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }
    public void verifyURL(String expectedURL){

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);

    }





}
