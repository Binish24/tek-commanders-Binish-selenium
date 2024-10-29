package ActivityDayThree.Week1ActivityDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewActivityOne {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://retail.tekschool-students.com/");
        chromeDriver.manage().window().maximize();

        String pageTitle= chromeDriver.getTitle();

        System.out.println(pageTitle);

        Thread.sleep(10000);

        By emailLocator=By.name("email");
        WebElement emailElement = chromeDriver.findElement(emailLocator);
        emailElement.sendKeys("nabiullah.benish@gmail.com");

        Thread.sleep(10000);

        By passLocator=By.name("password");
        WebElement passwordElement = chromeDriver.findElement(passLocator);
        passwordElement.sendKeys("password123");

        Thread.sleep(10000);

       By textLocator = By.linkText("Login");
       WebElement textElement = chromeDriver.findElement(textLocator);
       textElement.click();

       Thread.sleep(10000);

       chromeDriver.close();

    }


}
