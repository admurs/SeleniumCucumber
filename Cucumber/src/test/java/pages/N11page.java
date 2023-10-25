package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11page {
    public N11page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement btnGirisYap;
    @FindBy(id = "email")
    public WebElement txtEmail;
    @FindBy(id = "password")
    public WebElement txtPassword;
    @FindBy(id="loginButton")
    public WebElement kullaniciGirisYap;
    @FindBy(css = "a[title='Hesabım']")
    public WebElement btnHesabim;
    @FindBy(xpath = "//a[@title='Çıkış Yap']")
    public WebElement btnCikisYap;

}
