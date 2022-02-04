package Pages;

import Driver.Launch_Browser;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hompage extends Launch_Browser {
    By Product = By.partialLinkText("Sauce Labs Backpack");
    By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By ShoppingCart = By.className("shopping_cart_link");

    @Test(dependsOnGroups = {"login"})
    public void findProduct()
    {
        driver.findElement(Product).click();
        driver.findElement(AddToCart).click();
    }

    @Test(dependsOnGroups = {"login"})
    public void shoppingCartLink()
    {
        driver.findElement(ShoppingCart).click();

    }

}
