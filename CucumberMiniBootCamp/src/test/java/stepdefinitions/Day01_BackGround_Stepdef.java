package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day01_BackGround_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day01_BackGround_Stepdef {
    Day01_BackGround_Page page = new Day01_BackGround_Page();
    String expectURL;
    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etsURL"));
        expectURL=Driver.getDriver().getCurrentUrl();
    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
        ReusableMethods.hover(page.login);
    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {
        page.girisBtn.click();
    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.emailTxt.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("sifre girilir")
    public void sifreGirilir() {
        page.sifreTxt.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        page.loginBtn.click();
    }

    @Then("safaya gidilemedigi dogrulanir")
    public void safayaGidilemedigiDogrulanir() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectURL,actualUrl);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        page.uyeOlBtn.click();
    }

    @And("ad girilir")
    public void adGirilir() {
        page.adTxt.sendKeys("testAd");
    }

    @And("soyad girilir")
    public void soyadGirilir() {
        page.soyadTxt.sendKeys("testSoyad");
    }

    @And("uyelik epostasi girilir")
    public void uyelikEpostasiGirilir() {
        page.emailKayit.sendKeys("testmail@email.com");
    }

    @And("cep telefonu girilir")
    public void cepTelefonuGirilir() {
        page.telTxt.sendKeys("5054567890");
    }

    @And("uyelik icin sifre girilir")
    public void uyelikIcinSifreGirilir() {
        page.sifre0Txt.sendKeys("test123!");
    }

    @And("sifre yeniden girilir")
    public void sifreYenidenGirilir() {
        page.sifre1Txt.sendKeys("test123!");
    }

    @And("kullanım sartlari checkboxu isaretlenir")
    public void kullanımSartlariCheckboxuIsaretlenir() {
        page.kullanimChckBox.click();
    }

    @And("firsat checkboxu isaretlenir")
    public void firsatCheckboxuIsaretlenir() {
        page.firsatChckBox.click();
    }

    @When("kayit ol butonuna basilir")
    public void kayitOlButonunaBasilir() {
        page.kayitOlBtn.click();
    }
}
