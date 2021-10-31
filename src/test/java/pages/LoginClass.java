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

@FindBy (id = "_btn_create_account")
    public WebElement hesapOlusturbutton;


@FindBy(xpath = "//input[@placeholder='Ad Soyad']")
    public WebElement kullaniciAdSoyadi;

@FindBy (xpath = "//input[@placeholder='E-posta adresi']")
    public WebElement mail;

@FindBy (xpath = "//button[@type='submit']")
    public WebElement kayitButton;



}