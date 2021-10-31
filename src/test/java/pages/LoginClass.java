package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginClass {
    public WebDriver driver;

    public LoginClass() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




}