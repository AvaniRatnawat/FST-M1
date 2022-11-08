package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //Open form url
        driver.get("https://training-support.net/selenium/simple-form");

        //Get title of the page
        driver.getTitle();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Avani");

        WebElement lastName =  driver.findElement(By.id("lastName"));
        lastName.sendKeys("Test");

        driver.findElement(By.id("email")).sendKeys("test1.yopmail.com");

        driver.findElement(By.id("number")).sendKeys("9876543210");

        driver.findElement(By.cssSelector(".ui.green.button")).click();

        driver.close();
    }
}
