package Driver;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Launch_Browser {
    public static WebDriver driver;

    @BeforeClass
    public void LaunchBrowser()
    {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        //Deleting Cookies
        driver.manage().deleteAllCookies();

        //Maximize browser window
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void Close_Browser()
    {
        driver.close();
    }
}