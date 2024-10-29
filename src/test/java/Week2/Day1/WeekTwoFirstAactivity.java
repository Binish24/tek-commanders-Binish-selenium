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

        By searchBarLocator =By.xpath("//input[@class='search__input']");
        WebElement searchElement = chrome.findElement(searchBarLocator);
        searchElement.sendKeys("TV");

        Thread.sleep(2000);

        By searchButtonLocator =By.xpath("//button[@class='search__btn']");
        WebElement searchButtonElement = chrome.findElement(searchButtonLocator);
        searchButtonElement.click();

        Thread.sleep(3000);

        By firstItemoLocator =By.xpath("//div[@class='products__layout']");
        WebElement firstItemElement = chrome.findElement(firstItemoLocator);
        firstItemElement.click();
        Thread.sleep(3000);

       By titleLocator = By.xpath("//h1[@class='product__name']");
       WebElement titleElement = chrome.findElement(titleLocator);
       String text = titleElement.getText();
        System.out.println(text);

       chrome.quit();




    }
}
