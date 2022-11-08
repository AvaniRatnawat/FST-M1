package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void getCopyrightText(){

        //get copyright text in the footer
        String copyrightText = driver.findElement(By.id("admin_options")).getText();
        System.out.println("First copyright text in the footer :: "+copyrightText);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
