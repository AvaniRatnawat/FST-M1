package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.training-support.net");

        //Title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page : "+title);

        //Find About Us element using different locators:
        //Using Id
        WebElement byID = driver.findElement(By.id("about-link"));
        System.out.println("Text in byID element: "+byID.getText());

        //Using ClassName
        WebElement byClassName = driver.findElement(By.className("green"));
        System.out.println("Text in byClassName element: " + byClassName.getText());

        //Using LinkText
        WebElement byLinkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in byLinkText element: " + byLinkText.getText());

        //Using CSS Selector
        WebElement bycSSSelector = driver.findElement(By.cssSelector("a#about-link"));
        System.out.println("Text in byLinkText element: " + bycSSSelector.getText());

        //Close Driver
        driver.close();
    }
}
