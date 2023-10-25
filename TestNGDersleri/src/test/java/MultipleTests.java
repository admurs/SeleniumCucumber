
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import static org.testng.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;

public class MultipleTests {
    @Test(priority =4)
    public void openYoutube() {
        Driver.getDriver().get("http://www.youtube.com");
        System.out.println("Youtube sitesi açıldı");
        assertTrue(true);
        bekle(5);
    }

    @Test(priority =2)
    public void openAmazon() {
        Driver.getDriver().get("http://www.amazon.com");
        System.out.println("Amazon sitesi açıldı");
        assertTrue(true);
    }

    @Test(enabled = false)
    public void openAliexpress() {
        Driver.getDriver().get("http://www.aliexpress.com");
        System.out.println("Aliexpress sitesi açıldı");
        assertTrue(true);
    }

    @Test(priority =1,dependsOnMethods = "openYoutube")
    public void openFacebook() {
        Driver.getDriver().get("http://www.facebook.com");
        System.out.println("Facebook sitesi açıldı");
        assertTrue(true);
    }

    @AfterMethod
    public void afterMethod() {
        Driver.quitDriver();
    }
}
