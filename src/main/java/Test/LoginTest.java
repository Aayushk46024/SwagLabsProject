package Test;

import Driver.Launch_Browser;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Launch_Browser {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

}
