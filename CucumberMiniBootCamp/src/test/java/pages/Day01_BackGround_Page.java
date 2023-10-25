package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day01_BackGround_Page {
    public Day01_BackGround_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='dropbtn nothidden']")
    public WebElement login;
    @FindBy(xpath = "//button[@data-target='#modalSignIn']")
    public WebElement girisBtn;
    @FindBy(id = "tb-contactEmailSignIn")
    public WebElement emailTxt;
    @FindBy(id = "showPass_2")
    public WebElement sifreTxt;
    @FindBy(id="btn-signin")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[@class='alert tooltip-warning text-center']")
    public WebElement alert;
    @FindBy(xpath = "//button[@data-target='#modalSignUp']")
    public WebElement uyeOlBtn;
    @FindBy(id="tb-signUp-firstName")
    public WebElement adTxt;
    @FindBy(id="tb-signUp-lastName")
    public WebElement soyadTxt;
    @FindBy(id="tb-contactEmailSignUp")
    public WebElement emailKayit;
    @FindBy(id="contactFormPhoneNumber")
    public WebElement telTxt;
    @FindBy(id="showPass_0")
    public WebElement sifre0Txt;
    @FindBy(id="showPass_1")
    public WebElement sifre1Txt;
    @FindBy(xpath="//label[@for='cb-termPrivacy']")
    public WebElement kullanimChckBox;
    @FindBy(xpath="//label[@for='cb-dealCampaign']")
    public WebElement firsatChckBox;
    @FindBy(id = "btn-signup")
    public WebElement kayitOlBtn;
}
