package io.prompt.pages;

import com.github.javafaker.Faker;
import io.prompt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Queue']")
    public WebElement queue;

    @FindBy(xpath = "//span[.='Broadcasts']")
    public WebElement broadcasts;

    Faker faker =new Faker();
    public String messagetext(){
        return "Automation Test text + HD video faker# "+ faker.numerify("###-###-###");
    }




}
