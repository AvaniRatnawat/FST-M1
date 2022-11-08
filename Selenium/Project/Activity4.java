package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void login() throws InterruptedException {

        //enter username
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("user_name"));
        username.sendKeys("admin");

       //enter password
       WebElement password = driver.findElement(By.id("username_password"));
       password.sendKeys("pa$$w0rd");

       //click on login button
       driver.findElement(By.xpath(".//input[@type='submit']")).click();
    }

    @Test
    public void verifyHomePage() throws InterruptedException {

        //Verify home page is opened
        Thread.sleep(2000);
        WebElement homeIcon = driver.findElement(By.xpath(".//a[contains(@class,'-home')]"));
        Assert.assertTrue(homeIcon.isDisplayed(), "Home page is opened");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
