package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title :: "+driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("testuser");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testemail@yopmail.com");
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        driver.close();
    }
}
