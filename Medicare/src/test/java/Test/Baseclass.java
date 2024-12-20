package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Baseclass
{
    WebDriver wdriver;
    @BeforeMethod
    public void LaunchBrowser()
    {
        wdriver = new ChromeDriver();
        wdriver.get("http://localhost:8081/medicare/");
        wdriver.manage().window().maximize();
        wdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    public void tearDown() {
       wdriver.close();
    }
}
