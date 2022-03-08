package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String Title = driver.getTitle();
        System.out.println("Title: " + Title);
        WebElement first_name = driver.findElement(By.id("firstName"));
        first_name.sendKeys("Sri Charitha");
        WebElement last_name = driver.findElement(By.id("lastName"));
        last_name.sendKeys("Nochuri");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sri.charitha@gmail.com");
        WebElement contact = driver.findElement(By.id("number"));
        contact.sendKeys("9586533456");
        driver.findElement(By.cssSelector("input.green")).click();
        driver.close();

    }
}
