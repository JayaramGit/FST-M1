package SuiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import java.time.Duration;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("/html/body/div[2]/nav/div/div[2]/ul"));
        for (WebElement i: list){
            if (i.getText().contains("ACTIVITIES")){
                System.out.println("Contains Activities");
            }
            else{
                System.out.println("Does not contain Activities");
            }

        }
        driver.close();
    }
}
