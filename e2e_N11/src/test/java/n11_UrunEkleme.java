
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class n11_UrunEkleme {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testN11Scenario() {
        driver.get("https://www.n11.com/");
        assertEquals(driver.getTitle(), "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi");
        driver.findElement(By.id("searchData")).sendKeys("iphone");
        driver.findElement(By.xpath("//span[@class='iconsSearch']")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='resultText '] //strong")).getText(), "49");
        driver.navigate().back();
        driver.navigate().forward();
    }
    @Test
    @Disabled
    public void testN11_2() {

    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

