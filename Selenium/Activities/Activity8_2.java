package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("col size: "+ cols.size());
        WebElement second_row_col = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second Row Column: " +  second_row_col.getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
        WebElement second_row_col_after = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second Row Column: " +  second_row_col_after.getText());
        System.out.println(driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr")));
        driver.close();
    }


}
