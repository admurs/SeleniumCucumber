package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;
    @FindBys(@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']"))
    public List<WebElement> productTitles;
}
