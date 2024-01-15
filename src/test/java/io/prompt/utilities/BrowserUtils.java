package io.prompt.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public void waitForElementToBeVisible(WebElement element, int seconds) {
        new WebDriverWait(Driver.getDriver(), seconds).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeEnabled(WebElement element, int seconds) {
        new WebDriverWait(Driver.getDriver(), seconds).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeInvisible(WebElement element, int seconds) {
        new WebDriverWait(Driver.getDriver(), seconds).until(ExpectedConditions.invisibilityOf(element));
    }

    public void verifyURL(String expectedURL) {
        //Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }

}
