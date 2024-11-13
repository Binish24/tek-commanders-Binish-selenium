package Week_3.Day_3.Day_3_MousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class clickButtonTest {
    public static void main(String[] args) throws InterruptedException {

//        String amazonUrl ="https://www.amazon.com/";
//        WebDriver  driver = new EdgeDriver();
//        driver.get(amazonUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement medicalCareButton = driver.findElement(By.xpath("//span[text()='Medical Care']"));
//
//       Actions action = new Actions(driver);
//
//      // action.click(medicalCareButton).perform();
//
//        action.contextClick(medicalCareButton).perform();
//
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        //***********************               ************************                ***************************


//        WebDriver driver = new EdgeDriver();
//        String baseUrl= "https://www.amazon.com/";
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//
//        WebElement groceriesButton = driver.findElement(By.xpath("//span[text() = 'Groceries']"));
//
//        Actions action = new Actions(driver);
//
//       // action.click(groceriesButton).perform();
//
//        action.contextClick(groceriesButton).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        //@@@@@@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@@@             @@@@@@@@@@@@@@@@@@@@@\\

//        WebDriver driver = new EdgeDriver();
//        String baseUrl = "https://www.amazon.com/";
//        //driver.get ="https://www.amazon.com/";
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(1500);
//
//        WebElement primeButton = driver.findElement(By.xpath("//span[text() ='Prime']"));
//
//        //primeButton.click();
//
//        Actions action = new Actions(driver);
//       // action.click(primeButton).perform();
//        action.contextClick(primeButton).perform();
//
//
//        Thread.sleep(1500);
//
//        driver.close();
//        driver.quit();

        //###########################        $$$$$$$$$$$$$$$$$$$$$$$$$$$      ###########################\\

//        String baseUrl = "https://www.bbc.com/persian";
//       WebDriver driver = new EdgeDriver();
//       driver.get(baseUrl);
//       driver.manage().window().maximize();
//
//       Thread.sleep(1000);
//
//
//       WebElement selectLanguageAlert = driver.findElement(By.xpath("//img[@class ='img_ad']"));
//
//       // selectLanguageAlert.click();
//
//        Actions action = new Actions(driver);
//        //action.click(selectLanguageAlert).perform();
//        action.contextClick(selectLanguageAlert).perform();
//
//        Thread.sleep(1500);
//
//
//        driver.close();
//        driver.quit();

/////////////*****************************************************************************************/\\\\\\\\\\\\\


        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://www.bbc.com/persian";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        Thread.sleep(1500);


        WebElement afghanistanButton = driver.findElement(By.xpath("//a[text()='افغانستان']"));

        //afghanistanButton.click();
        Thread.sleep(1500);


        Actions action = new Actions(driver);
        action.click(afghanistanButton).perform();

        Thread.sleep(1500);

        driver.close();
        driver.quit();


        ///**********************************************/////******************************************////



//        WebDriver driver = new EdgeDriver();
//        driver.get("https://wwww.amazon.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(1500);
//
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//
//        Thread.sleep(1500);
//
//        driver.close();
//        driver.quit();

        //////////######################\\\\\\\\\\\\\////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.youtube.com/");
//        driver.manage().window().maximize();
//
//        String pageTitle= driver.getTitle();
//        System.out.println(pageTitle);
//
//        Thread.sleep(1500);
//
//        driver.close();
//        driver.quit();






    }
}
