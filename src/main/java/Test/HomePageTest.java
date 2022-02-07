package Test;

import Driver.Launch_Browser;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends Launch_Browser {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }


    @Test(dependsOnMethods = "login")
    public void homepage(){
        HomePage hpt = new HomePage();
        hpt.findProduct();
        hpt.shoppingCartLink();
    }
}
