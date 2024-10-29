package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingRelativeXpathDayTwoFirstExample {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/profile");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By emailLocator = By.xpath("//input[@name = 'email']");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("mohammad2536@gmail.com");

        Thread.sleep(3000);

       By passwordLocator = By.xpath("//input[@name = 'password']");
       WebElement passwordElement = driver.findElement(passwordLocator);
       passwordElement.sendKeys("Password@123");

      By loginLocator = By.xpath("//button[text() ='Login']");
      WebElement loginElement = driver.findElement(loginLocator);
      loginElement.click();


       By accontloginLocator = By.xpath("//a[contains (text (), 'Account']");
        WebElement accountLoginElement = driver.findElement(accontloginLocator);
        String textAccount = driver.getTitle();
        System.out.println(textAccount);

        driver.quit();
    }
}
