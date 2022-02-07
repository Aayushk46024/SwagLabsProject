package Pages;

import Driver.Launch_Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends Launch_Browser {
    By Product = By.partialLinkText("Sauce Labs Backpack");
    By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By ShoppingCart = By.className("shopping_cart_link");

    @Test
    public void findProduct()
    {
        driver.findElement(Product).click();
        driver.findElement(AddToCart).click();
    }

    @Test
    public void shoppingCartLink()
    {
        driver.findElement(ShoppingCart).click();

    }

}
