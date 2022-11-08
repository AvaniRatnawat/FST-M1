package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String args[]){

        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/dynamic-controls");

        System.out.println("Title of the page: "+driver.getTitle());
        WebElement input = driver.findElement(By.id("input-text"));
        System.out.println("Is input enabled: "+input.isEnabled());
        driver.findElement(By.xpath("//button[text() = 'Enable Input']")).click();
        System.out.println("Is input enabled after clicking on Enable Input button: "+input.isEnabled());

        driver.close();
    }
}
