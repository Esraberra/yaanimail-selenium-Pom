package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Login_Test {

 @Test
    public void login(){

     Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
 }






}
