package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RaporluTeknosaPage {
    public RaporluTeknosaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
           }
    @FindBy(xpath = "//button[@class='search-button js_search_button sbx-fake btn-search']")
    public WebElement search;

    @FindBy(xpath = "//button[@class='search-button js_search_button sbx-fake btn-search-hata']")
    public WebElement search2;

}
