package AactivityDay2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class UsingIdLocators {

    public static void main(String[] args) {

//
//        ChromeDriver chromeDriver = new ChromeDriver();
//
//        chromeDriver.get("https://retail.tekschool-students.com/");
//
//        chromeDriver.manage().window().maximize();
//
//        //step 1 Locate the element
//
//        By signInLink = By.id("signInLink");
//
//        //step 2 Ask selenium to find the Element
//
//       WebElement signInElement = chromeDriver. findElement(signInLink);
//
//       //step 3 perform the action
//
//        signInElement.click();
//////////////////////////////

//        ChromeDriver chrome = new ChromeDriver();
//
//        chrome.get("https://retail.tekschool-students.com/");
//        chrome.manage().window().maximize();
//
//        By orderLink = By.id("orderLink");
//
//        WebElement oderElement = chrome.findElement(orderLink);
//
//        oderElement.click();


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

       By accountLink = By.id("accountLink");

       WebElement accountElement = driver.findElement(accountLink);
       accountElement.click();




    }



}
