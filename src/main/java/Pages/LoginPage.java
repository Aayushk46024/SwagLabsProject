package Pages;

import org.openqa.selenium.By;

import Driver.Launch_Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPage extends Launch_Browser {

    By Username = By.id("user-name");
    By Password = By.id("password");
    By LoginButton = By.id("login-button");

    @Test
    public void login()
    {
        driver.findElement(Username).sendKeys("standard_user");
        driver.findElement(Password).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

}
