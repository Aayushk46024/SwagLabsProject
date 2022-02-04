package Test;

import Driver.Launch_Browser;
import Pages.LoginPage;
import Pages.Logout;
import org.testng.annotations.Test;

public class LogoutTest extends Launch_Browser {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }


    @Test(dependsOnMethods = "login")
    public void logout(){
        Logout logout = new Logout();
        logout.logout();
    }
}
