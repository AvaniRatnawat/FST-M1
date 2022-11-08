package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page title is: " + driver.getTitle());

        //Click the button to open a prompt
        driver.findElement(By.cssSelector("button#prompt")).click();

        //Switch to prompt window
        Alert promptAlert = driver.switchTo().alert();

        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);

        promptAlert.sendKeys("Awesome!");

        //Close the prompt
        promptAlert.accept();

        driver.close();
    }
}
