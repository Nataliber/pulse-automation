package io.prompt.pages;

import com.github.javafaker.Faker;
import io.prompt.utilities.ApplicationReader;
import io.prompt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}


