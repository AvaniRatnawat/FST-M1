package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Page Title : "+driver.getTitle());

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Avani");
        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test1@yopmail.com");
        driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("9876543210");
        driver.findElement(By.xpath("//textarea")).sendKeys("Activity 4-2");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        driver.close();
    }
}
