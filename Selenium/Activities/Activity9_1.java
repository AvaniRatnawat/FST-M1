package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");

        //9-1

        WebElement chosen = driver.findElement(By.id("single-value"));

        Select option = new Select(driver.findElement(By.xpath("//select[@id='single-select']")));

        option.selectByVisibleText("Option 2");
        System.out.println("Chosen :: "+chosen.getText());

        option.selectByIndex(3);
        System.out.println("Chosen :: "+chosen.getText());

        option.selectByValue("4");
        System.out.println("Chosen :: "+chosen.getText());

        List<WebElement> allOptions = option.getOptions();
        for(WebElement selection : allOptions){
            System.out.println("Option :: "+selection.getText());
        }

        //9-2
        WebElement chosenValue = driver.findElement(By.id("multi-value"));
        Select multiSelectElement = new Select(driver.findElement(By.id("multi-select")));

        if(multiSelectElement.isMultiple()){

            multiSelectElement.selectByVisibleText("Javascript");
            System.out.println("Selected : "+chosenValue.getText());

            multiSelectElement.selectByValue("node");
            System.out.println("Selected : "+chosenValue.getText());

            for(int i=4; i<=6; i++) {
                multiSelectElement.selectByIndex(i);
                System.out.println("Selected : "+chosenValue.getText());
            }
            multiSelectElement.deselectByValue("node");
            System.out.println("Deselected : "+chosenValue.getText());

            multiSelectElement.deselectByIndex(7);
            System.out.println("Deselected : "+chosenValue.getText());

            //Get all selected options
            List<WebElement> selectedOptions = multiSelectElement.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }

            //Deselect all options
            multiSelectElement.deselectAll();
            System.out.println(chosen.getText());
        }
        driver.close();
    }

}
