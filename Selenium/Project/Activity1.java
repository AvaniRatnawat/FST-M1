package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity1 {

    WebDriver driver;
    String websiteTitle;


    @BeforeTest
    public void setup(){
        //Create driver instance & open the CRM website
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void verifyTitle(){

        //Verify title
        websiteTitle = driver.getTitle();
        assertEquals(websiteTitle, "SuiteCRM");
        System.out.println("Website's title is  :: "+websiteTitle);
    }

    @AfterTest
    public void closeBrowser(){
        if(websiteTitle.equals("SuiteCRM"))
            driver.close();
    }
}
