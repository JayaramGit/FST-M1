package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        System.out.println(driver.getTitle());
        driver.close();

    }
}
