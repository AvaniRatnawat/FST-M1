package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test(priority = 1)
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
    public void readAdditionalInformation() throws InterruptedException{

        //get navigation menu color

        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//span[@title='Additional Details']")).click();
        String title = driver.findElement(By.xpath("//h2[text()=' Lead:']")).getText();
        String phone = driver.findElement(By.xpath("//span[@class='phone']")).getText();

        System.out.println("Title : "+title+" :: phone : "+phone);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
