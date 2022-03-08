package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("col size: " + cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("row size: " + rows.size());
        List<WebElement> third_row = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for (WebElement cells : third_row) {
            System.out.println(cells.getText());
        }
        WebElement second_row_col = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second Row Column: " + second_row_col.getText());
        driver.close();
    }

    }