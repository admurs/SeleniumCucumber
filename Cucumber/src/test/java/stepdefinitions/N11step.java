package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.N11page;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;


public class N11step {
    N11page n11page = new N11page();
    Actions action = new Actions(getDriver());

    @Given("Kullanıcı ana sayfaya gider")
    public void kullanıcıAnaSayfayaGider() {

    }

    @When("Ana sayfanın yüklendiği doğrulanır")
    public void anaSayfanınYuklendigiDogrulanır() {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("Kullanıcı ana sayfada Giriş Yap butonunu bulur ve tıklar")
    public void kullanıcıAnaSayfadaGirisYapButonunuBulurVeTıklar() {
        n11page.btnGirisYap.click();
    }

    @And("Giriş sayfasının yüklendiği doğrulanır")
    public void girisSayfasınınYuklendigiDogrulanır() {
        String actualURL = getDriver().getCurrentUrl();
        String expectedURL = "https://www.n11.com/giris-yap";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @And("Kullanıcı giriş sayfasında geçerli bir kullanıcı adı girer")
    public void kullanıcıGirisSayfasındaGecerliBirKullanıcıAdıGirer() {
        n11page.txtEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı giriş sayfasında geçerli bir şifre girer")
    public void kullanıcıGirisSayfasındaGecerliBirSifreGirer() {
        n11page.txtPassword.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @And("Kullanıcı Giriş Yap butonuna tıklar")
    public void kullanıcıGirisYapButonunaTıklar() {
        n11page.kullaniciGirisYap.click();
    }

    @And("Kullanıcının hesabına başarılı giriş yapıldığı doğrulanır")
    public void kullanıcınınHesabınaBasarılıGirisYapıldıgıDogrulanır() {
        action.moveToElement(n11page.btnHesabim).perform();
        Assert.assertTrue(n11page.btnCikisYap.isEnabled());
    }


}
