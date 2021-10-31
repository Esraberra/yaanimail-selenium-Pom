package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginClass {
    WebDriver driver;

    public LoginClass(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }



}
