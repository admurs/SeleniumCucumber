package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;



import static org.testng.Assert.assertEquals;

public class AmazonTest {
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void searchProduct() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAmazon"));
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("amazonSearch"));
        amazonPage.searchButton.click();
        String title = Driver.getDriver().getTitle();
        String expectTitle = "Amazon.com : laptop";
        assertEquals(title, expectTitle);
        if (expectTitle.equals(title)) {
            System.out.println("Title True");
        } else {
            System.out.println("Title False");
        }

        for (WebElement productTitle : amazonPage.productTitles) {
            String pTitle = productTitle.getText();
            System.out.println(pTitle);
        }
        int actualTitleCount = 22;
        int expectedTitleCount =amazonPage.productTitles.size();
        assertEquals(expectedTitleCount, actualTitleCount, "Beklenen: " + actualTitleCount + " Gerçekleşen: " + expectedTitleCount);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
        Driver.quitDriver();
    }
}
