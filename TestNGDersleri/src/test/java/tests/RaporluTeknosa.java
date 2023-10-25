package tests;

import org.testng.annotations.Test;
import pages.RaporluTeknosaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class RaporluTeknosa extends TestBaseRapor {
    RaporluTeknosaPage raporluTeknosaPage = new RaporluTeknosaPage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Teknosa Arama Testi");
        Driver.getDriver().get(ConfigReader.getProperty("urlTeknosa"));
        extentTest.info("Kullanıcı Teknosa anasayfasına gider");
        raporluTeknosaPage.search.sendKeys("monster");
        raporluTeknosaPage.search.submit();
        extentTest.info("Arama kutusuna belirlenen aranacak kelime yazılır ve aratılır");
        raporluTeknosaPage.search2.submit();
        extentTest.info("Hatalı işlem");

    }
}
