package Pages;

import Driver.Launch_Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AboutPage extends Launch_Browser {

    By HomeButton = By.id("react-burger-menu-btn");
    By About = By.id("about_sidebar_link");

    @Test
    public void about(){
        driver.findElement(HomeButton).click();
        driver.findElement(About).click();
    }
}
