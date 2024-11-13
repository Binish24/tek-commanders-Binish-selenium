package reviewingSeleniumFromScratch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class printingOfAwebTitle {
    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.bbc.com/persian");
//        driver.manage().window().maximize();
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//
//        Thread.sleep(2000);
//
//        driver.close();
//
//        driver.quit();



//        WebDriver driver = new EdgeDriver();
//
//        String baseUrl = "https://tolonews.com/";
//        driver.manage().window().maximize();
//
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();


//        WebDriver driver =new EdgeDriver();
//        driver.get("https://tolonews.com/");
//        driver.manage().window().maximize();
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

//
//        WebDriver driver = new EdgeDriver();
//        String baseUrl = "https://www.google.com/";
//        driver.manage().window().maximize();
//        driver.get(baseUrl);
//
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://monday.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        Thread.sleep(3000);

        driver.close();

        driver.quit();




    }
}
