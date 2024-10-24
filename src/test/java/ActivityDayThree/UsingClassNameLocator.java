package ActivityDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class UsingClassNameLocator {

    public static void main (String [] args) throws InterruptedException {

//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get("");
//        chrome.manage().window().maximize();
//        Thread.sleep(5000);
//        By signinLocator = By.id("signinLink");
//        chrome.findElement(signinLocator).click(); //WebElement subTitleElement = chrome.findElement(subTitleLocator);
//                                                     //subTitleElement.click;
//      ////  String pageTitle = chrome.getTitle();
//
//       By loginLocator = By.className("login__subtitle");
//       WebElement loginElement =chrome.findElement(loginLocator);
//
//
//       String Text = loginElement.getText();
//        System.out.println(Text);
//
//
//        Thread.sleep(10000);
//
//        chrome.close();


//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(5000);
//        By signInLocator = By.id("signinLink");
//        driver.findElement(signInLocator).click();
//
//        Thread.sleep(3000);
//        By loginSubTitleLocator = By.className("login__subtitle");
//        WebElement loginSubTitleElement = driver.findElement(loginSubTitleLocator);
//
//        String text = loginSubTitleElement.getText();
//        System.out.println(text);
//
//        ///String text = loginSubTitleElement.getText();
//        System.out.println(text);
//
//
//        Thread.sleep(10000);
//        driver.close();

        ChromeDriver chrDriver = new ChromeDriver();
        chrDriver.get("https://retail.tekschool-students.com/");
        chrDriver.manage().window().maximize();

        Thread.sleep(10000);

       By textLogoLocator = By.className("top-nav__logo");
       WebElement textLogoElement = chrDriver.findElement(textLogoLocator);
       textLogoElement.click();

       Thread.sleep(5000);

       String text = textLogoElement.getText();
        System.out.println(text);

        Thread.sleep(5000);

        chrDriver.close();






























    }


}
