package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity2 {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void getImageURL(){

        //get header image source
        String imageURL = driver.findElement(By.xpath(".//div[@class = 'companylogo']/img")).getAttribute("src");
        System.out.println("Header image source :: "+imageURL);
    }

    @AfterTest
    public void closeBrowser(){
            driver.close();
    }
}
