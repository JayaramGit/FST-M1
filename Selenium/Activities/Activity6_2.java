package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button")).click();
        WebElement text = driver.findElement(By.id("ajax-content"));
        System.out.println(text.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm Late!"));
        System.out.println(text.getText());
        driver.close();
    }

}
