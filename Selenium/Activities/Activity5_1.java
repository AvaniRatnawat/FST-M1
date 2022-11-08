package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String args[]){

        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page: "+driver.getTitle());
        WebElement checbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Is checkbox present: "+checbox.isSelected());
        checbox.click();
        System.out.println("Is checkbox present after clicking on Remove checkbox button: "+checbox.isSelected());

        driver.close();
    }
}
