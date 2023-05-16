package io.prompt.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {


   private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


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

    public static void clickWithJS(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) (Driver.getDriver())).executeScript("arguments[0].click()", element);
    }

}
