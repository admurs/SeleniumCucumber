import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Aliexpress {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://aliexpress.com");
    }
    @Test
    public void testProductSearcher() {
        String mainWindowHandle= driver.getWindowHandle();
        for (String windowHandle: driver.getWindowHandles()){
            if (!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.id("search-key")).sendKeys("tv box");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        driver.findElement(By.xpath("(//span[@class='checkbox--checkbox--1m3l2a6 normalItem--checkboxContainer--3fr9Bqa'])[8]")).click();
    }
}
