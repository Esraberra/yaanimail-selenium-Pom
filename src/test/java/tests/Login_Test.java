package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.LoginClass;
import utilities.ConfigReader;
import utilities.Driver;

public class Login_Test {
    LoginClass loginClass;

 @Test
    public void login(){
loginClass=new LoginClass();
     Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
     loginClass.hesapOlusturbutton.click();
     loginClass.kullaniciAdSoyadi.sendKeys("Esra Kücük");
     loginClass.mail.sendKeys("esrasey_men");
     Actions actions=new
             Actions(Driver.getDriver());
     actions.sendKeys(Keys.TAB).sendKeys("Berra8513!").
             sendKeys(Keys.TAB).sendKeys("Berra8513!").
             sendKeys(Keys.TAB).sendKeys("10-05-1985").perform();
     loginClass.kayitButton.click();

 }






}
