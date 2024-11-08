package Week1.ActivityDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewActivityNameLocator {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrDriver = new ChromeDriver();
        chrDriver.get("https://www.facebook.com/");
        chrDriver.manage().window().maximize();

        String pageTitle = chrDriver.getTitle();
        System.out.println(pageTitle);


       By emailLocator = By.name("email");
        WebElement emailLocatorElement = chrDriver.findElement(emailLocator);
        emailLocatorElement.sendKeys("nabiullah_benash@yahoo.com");

       By passLocator = By.name("pass");
       WebElement passLocatorElement = chrDriver.findElement(passLocator);
       passLocatorElement.sendKeys("Benish123");

       By loginLocator = By.name("login");
       WebElement loginLocatorElement = chrDriver.findElement(loginLocator);
       loginLocatorElement.click();

       Thread.sleep(1000);

       chrDriver.close();









    }



}
