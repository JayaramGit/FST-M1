import io.cucumber.java.bs.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;

public class SuiteCRM {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        driver.getTitle().equals("SuiteCRM");

        WebElement suiteCRMimage = driver.findElement(By.xpath("//img[@src='themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g']"));
        String src = suiteCRMimage.getAttribute("src");
        System.out.println("SuiteCRM image url is :" +src);

        WebElement copyright = driver.findElement(By.xpath("//a[text()='© Supercharged by SuiteCRM']"));
        String Copyright = copyright.getText();
        System.out.println(Copyright);

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String homePagetitle = driver.getTitle();
        driver.getTitle().equals("SuiteCRM");
        System.out.println(homePagetitle + " Page Opened");

        WebElement menu = driver.findElement(By.xpath("//a[text()='Activities']"));
        String me = menu.getText();
        System.out.println(me);
        //String[] m = me.split("=");
        System.out.println(me + " menu item exists");

        driver.findElement(By.xpath("//a[text()='Sales']")).click();

        //Actions action = new Actions(driver);
        //action.moveToElement(sales);
        //Select salesdropdown = new Select (driver.findElement(By.xpath("//a[text()='Sales']//following::ul[@class='dropdown-menu'][1]")));
        //salesdropdown.selectByVisibleText("Leads");
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[@id='adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab']//span[@title='Additional Details'][1]")).click();
        //Thread.sleep(1000);
        //WebElement phoneno = driver.findElement(By.xpath("(//span[text()=["+ i +"]"));
        //Thread.sleep(1000);
        //phoneno.getText();
        //System.out.println(phoneno);
        Alert alert = driver.switchTo().alert();
        //al.wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println(text);
        alert.dismiss();




        //driver.quit();
    }

}
