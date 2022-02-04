package Pages;

import Driver.Launch_Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout extends Launch_Browser {
    By HomeButton = By.id("react-burger-menu-btn");
    By Logout = By.id("logout_sidebar_link");

    @Test(dependsOnGroups = {"login"})
    public void logout(){
        driver.findElement(HomeButton).click();
        driver.findElement(Logout).click();
    }
}
