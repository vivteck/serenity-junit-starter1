package testcases;

import org.junit.Test;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Webdriver;
@RunWith(SerenityRunner.class)

public class MyFirstTestCase {

    @Managed
    WebDriver driver;

    @Test
    public void myGoogleSearch() throws InterruptedException
    {
      driver.get("https://www.google.co.uk/");
      driver.manage().window().maximize();
     // driver.wait(3000);
      driver.findElement(By.name("q")).sendKeys("selenium for serenity");

    }

}
