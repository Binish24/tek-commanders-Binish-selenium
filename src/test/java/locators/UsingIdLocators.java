package locators;

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

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://retail.tekschool-students.com/");
        chromeDriver.manage().window().maximize();

        By orderLink = By.id("orderLink");

        WebElement oderElement = chromeDriver.findElement(orderLink);

        oderElement.click();




    }



}
