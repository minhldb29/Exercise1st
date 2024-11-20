import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exercise1 {
    @Test
    public void test (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chotot.com/");
        driver.manage().window().maximize();
        System.out.println("Access to page chotot.vn successfully!");
        driver.quit();
    }
}
