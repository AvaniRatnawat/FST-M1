package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test (priority = 1)
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
        Thread.sleep(2000);
    }

    @Test (priority = 2)
    public void getColour() throws InterruptedException{

        //get navigation menu color

        Thread.sleep(4000);
        WebElement toolbar = driver.findElement(By.xpath("//nav[@role='navigation']"));
        String color = toolbar.getCssValue("background-color");
        System.out.println("Navigation bar color :: "+color);
    }

   @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
