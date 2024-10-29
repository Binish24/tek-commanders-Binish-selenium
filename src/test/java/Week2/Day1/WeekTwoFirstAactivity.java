package Week2.Day1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeekTwoFirstAactivity {

    public static void main(String[] args) throws InterruptedException {

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        By linkLocator =By.xpath("//img[@name=city]");
//        WebElement linkElement= driver.findElement(linkLocator);
//        linkElement.click();
//
//        Thread.sleep(3000);
//
//        driver.quit();
//
//

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://retail.tekschool-students.com/");
        chrome.manage().window().maximize();

        Thread.sleep(1000);

       By titleLocator = By.xpath("//h1[@class='product__name']");
       WebElement titleElement = chrome.findElement(titleLocator);
     String text = titleElement.getText();
        System.out.println(text);

       chrome.quit();




    }
}
