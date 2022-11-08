package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity12_1 {

    public static void main(String args[]){


        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://www.training-support.net");
//        driver.get("http://madhank93.github.io/");
//       System.out.println( driver.getCurrentUrl());

        driver.findElement(By.xpath("")).sendKeys();

        Select select = new Select(driver.findElement(By.xpath("")));
        select.toString();

        driver.close();

    }
}
