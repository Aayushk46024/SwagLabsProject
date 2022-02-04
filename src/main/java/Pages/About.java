package Pages;

import Driver.Launch_Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class About extends Launch_Browser {
    By HomeButton = By.id("react-burger-menu-btn");
    By About = By.id("about_sidebar_link");

    @Test(dependsOnGroups = {"login"})
    public void about(){
        driver.findElement(HomeButton).click();
        driver.findElement(About).click();
    }
}
