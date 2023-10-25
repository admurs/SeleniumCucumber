package day02;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        String title= driver.getTitle();
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement isim=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        WebElement fiyat=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement kurus=driver.findElement(By.xpath("//span[@class='a-price-fraction']"));
        String ilkUrunIsim= (isim.getText()).substring(0,50);
        String ilkUrunFiyat= fiyat.getText();
        String ilkUrunKurus= kurus.getText();
        System.out.println(ilkUrunIsim+" "+ilkUrunFiyat+","+ilkUrunKurus);
        isim.click();
        driver.findElement(By.id("submit.add-to-cart")).click();
        driver.findElement(By.id("sw-gtc")).click();
        WebElement sepetIsim=driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
        String kontrolIsim=(sepetIsim.getText()).substring(0,50);
        System.out.println(kontrolIsim);
        Assert.assertTrue(kontrolIsim.contains(ilkUrunIsim));
        driver.findElement(By.xpath("//input[@value='Sil']")).click();
        Thread.sleep(2000);
        Assert.assertTrue((driver.findElement(By.id("sc-subtotal-label-activecart")).getText()).contains("Ara toplam (0 ürün):"));
        driver.findElement(By.id("nav-logo-sprites")).click();
        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();
    }
}
