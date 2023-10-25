package tests;

import org.testng.annotations.Test;
import pages.UdemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UdemyTest {
    UdemyPage udemyPage=new UdemyPage();
    @Test
    public void testUdemy() {
        Driver.getDriver().get(ConfigReader.getProperty("urlUdemy"));
        udemyPage.searchBox.sendKeys(ConfigReader.getProperty("udemySearch"));
    }


}
