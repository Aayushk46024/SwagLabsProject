package Test;

import Driver.Launch_Browser;
import Pages.AboutPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.annotations.Test;

public class AboutPageTest extends Launch_Browser {
    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }


    @Test(dependsOnMethods = "login")
    public void about(){
        AboutPage ab = new AboutPage();
        ab.about();
    }
}
