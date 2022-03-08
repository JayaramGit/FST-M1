package Activities;

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
        WebElement dropdown = driver.findElement(By.id("single-value"));
        Select list = new Select(driver.findElement(By.id("single-select")));
        list.selectByVisibleText("Option 2");
        System.out.println(dropdown.getText());
        list.selectByIndex(3);
        System.out.println(dropdown.getText());
        list.selectByValue("4");
        System.out.println(dropdown.getText());
        List<WebElement> options = list.getOptions();
        for (WebElement option: options){

            System.out.println("Options: " + option.getText());
        }

        driver.close();

    }
}
