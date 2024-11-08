package Week1.ActivityDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRecapExample {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(10000);

       By loginSubTitleLocator = By.className("login__subtitle");
        WebElement loginSubTitleElement = driver.findElement(loginSubTitleLocator);
        loginSubTitleElement.click();

        Thread.sleep(10000);

        By emailLocator = By.className("login__input");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("wrongemail.facebook.com");

        Thread.sleep(10000);

       By passwordLocator = By.id("password");
       WebElement passElement = driver.findElement(passwordLocator);
       passElement.sendKeys("wrongpassword");

       Thread.sleep(10000);

       By loginLocator = By.id("loginBtn");
       WebElement loginElement= driver.findElement(loginLocator);
       loginElement.click();

       By errorLocator = By.className("error");
       WebElement errorElement = driver.findElement(errorLocator);

       String textError = errorElement.getText();
        System.out.println(textError);

        Thread.sleep(10000);

       driver.close();

       ///html/body/div/div/div/


    }

}
