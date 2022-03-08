package SuiteCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String Title = driver.getTitle();
        if (Title.equals("SuiteCRM")) {
            System.out.println("Title is SuiteCRM.");
            driver.close();
        } else {
            System.out.println("Title is not SuiteCRM.");
            System.out.println(Title);
        }



    }
}