import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class exercise2 {
    @Test
    public void test () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.grammarly.com/");
        driver.manage().window().maximize();
        try {
            WebElement loginBtn = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='headerDesktopRightItemsContainer_InJ6meKi']//a[contains(text(),'Log in')]")
            ));
            loginBtn.click();
        } catch (TimeoutException e) {
            System.out.println("Login button not found!");
        }
        driver.quit();
    }
}
