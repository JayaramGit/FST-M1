package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String Title = driver.getTitle();
        System.out.println("Title: " + Title);

        WebElement element1 = driver.findElement(By.id("about-link"));
        String text1 = element1.getText();
        System.out.println(text1);
        WebElement element2 = driver.findElement(By.className("ui inverted huge green button"));
        String text2 = element2.getText();
        System.out.println(text2);
        WebElement element3 = driver.findElement(By.linkText("about"));
        String text3 = element3.getText();
        System.out.println(text3);
        WebElement element4 = driver.findElement(By.cssSelector("#about-link"));
        String text4 = element4.getText();
        System.out.println(text4);
        driver.close();

    }
}
