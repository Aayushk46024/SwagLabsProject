package Test;

import Driver.Launch_Browser;
import Pages.About;
import Pages.LoginPage;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

public class AboutTest extends Launch_Browser {

    @Test
    public void about(){
        About about = new About();
        about.about();
    }
}
