package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/selenium/selects");
    WebElement multiSelect = driver.findElement(By.id("multi-value"));
    Select list = new Select(driver.findElement(By.id("multi-select")));

    if (list.isMultiple()){
        list.selectByVisibleText("JavaScript");
        System.out.println(multiSelect.getText());
        list.selectByValue("node");
        System.out.println(multiSelect.getText());
        for (int i=4; i<=6; i++){
            list.selectByIndex(i);
        }
        System.out.println(multiSelect.getText());
        list.deselectByValue("node");
        System.out.println(multiSelect.getText());
        list.deselectByIndex(7);
        System.out.println(multiSelect.getText());
        System.out.println(list.getFirstSelectedOption().getText());

        list.deselectAll();
        System.out.println(multiSelect.getText());
        driver.close();


    }
}
}