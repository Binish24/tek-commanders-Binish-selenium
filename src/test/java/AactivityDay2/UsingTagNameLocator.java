package AactivityDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class UsingTagNameLocator {

 public static void main(String[] args) throws InterruptedException {
//
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.bbc.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
         // Get all the links in Home pages

//        By linkLocator = By.tagName("a");    //<a> link </a>

         // Note: findElement () only return first element find in the DOM

//        WebElement linkElement = driver.findElement(linkLocator);
//        ///linkElement.click();
//        String linkText = linkElement.getText();
//        System.out.println("linkText: " + linkText);
//
//        driver.quit();
////
//     ChromeDriver driver = new ChromeDriver();
//     driver.get("https://www.naraiman.com/");
//     driver.manage().window().maximize();
//
//     Thread.sleep(1000);
//
//    By linkLocator = By.tagName("a");
//    WebElement linkElement = driver.findElement(linkLocator);
//    String text =linkElement.getText();
//     System.out.println(text);
//
//     driver.quit();

//     ChromeDriver chrome = new ChromeDriver();
//     chrome.get("https://tolonews.com/");
//     chrome.manage().window().maximize();
//
//     Thread.sleep(2000);
//
//     By linkLocator = By.tagName("a");
//     WebElement element = chrome.findElement(linkLocator);
//     String text = element.getText();
//     System.out.println(text);
//
//     chrome.quit();
//  ****************               **************      ******************
//     ChromeDriver chromeDriver = new ChromeDriver();
//     chromeDriver.get("https://tolonews.com/");
//     chromeDriver.manage().window().maximize();
//
//     Thread.sleep(2000);
//
//    By linkLocator = By.tagName("a");
//    List<WebElement> allLinkElements = chromeDriver.findElements( linkLocator);
//
//    for (WebElement element: allLinkElements){
//        String text = element.getText();
//        System.out.println(text);
//    }
//
//    chromeDriver.quit();
//

//     ChromeDriver driverOne = new ChromeDriver();
//     driverOne.get("https://naraiman.com/");
//     driverOne.manage().window().maximize();
//
//     Thread.sleep(3000);
//
//    By linkLocator = By.tagName("a");
//    List <WebElement> allLinksElements = driverOne.findElements(linkLocator);
//
//    for (WebElement element: allLinksElements){
//
//        String text = element.getText();
//        System.out.println(text);
//    }
//
//    driverOne.quit();

//     EdgeDriver driverTwo = new EdgeDriver();
//     driverTwo.get("https://www.bbc.com/news");
//     driverTwo.manage().window().maximize();
//
//     Thread.sleep(3000);
//
//    By linkLocator = By.tagName("a");
//    List <WebElement> allLinksElements = driverTwo.findElements(linkLocator);
//
//    for (WebElement element: allLinksElements){
//
//        String text = element.getText();
//        System.out.println(text);
//    }
//     driverTwo.quit();

     //***********         ******************          *********************

//     EdgeDriver driverZero = new EdgeDriver();
//     driverZero.get("https://www.bbc.com/news");
//     driverZero.manage().window().maximize();
//
//     Thread.sleep(3000);
//
//     By linkLocator = By.tagName("button");
//     List<WebElement> allLinksElement = driverZero.findElements(linkLocator);
//
//     for (WebElement element: allLinksElement){
//
//         String text = element.getText();
//         System.out.println(text);
//
//     }
//
//     driverZero.quit();

     ////****************            ********************         **************

     ChromeDriver driverThree = new ChromeDriver();
     driverThree.get("https://www.bbc.com/news");
     driverThree.manage().window().maximize();

     Thread.sleep(3000);


     By linkLocator = By.tagName("h2");
     List <WebElement> allElements = driverThree.findElements(linkLocator);

     for (WebElement element:allElements){

         String text = element.getText();
         System.out.println(text);
     }

     driverThree.quit();









    }



}
