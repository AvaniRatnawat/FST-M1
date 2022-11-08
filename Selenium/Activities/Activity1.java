package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        //Create instance of Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //Open the webpage
        driver.get("https://www.training-support.net");

        //Close driver
        driver.close();
    }
}
