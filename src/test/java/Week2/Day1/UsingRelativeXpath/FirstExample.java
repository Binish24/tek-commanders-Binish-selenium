package Week2.Day1.UsingRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class FirstExample {

    public static void main(String[] args) throws InterruptedException {


//        WebDriver driver = new ChromeDriver();
//        driver.get("https://dev.retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//       By searchBarLocator = By.id("searchInput");
//        WebElement searchBarElement= driver.findElement(searchBarLocator);
//        searchBarElement.sendKeys("Apple");
//
//        Thread.sleep(3000);
//
//      By searchButtonLocator =  By.className("ant-input-search-button");
//      WebElement searchButtonElement = driver.findElement(searchButtonLocator);
//      searchButtonElement.click();
//
//      Thread.sleep(3000);
//
//      By productCardLocator =By.className("ant-card-hoverable");
//      List<WebElement> productCardElement = driver.findElements(productCardLocator);
//      //productCartElement.click();
//
//        int cardSize = productCardElement.size();
//        System.out.println(cardSize);
//
//
//
//      Thread.sleep(1000);
//
//      driver.quit();


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By searchBarLocator = By.xpath("//input[@id ='searchInput']");
       WebElement searchBarElement = driver.findElement(searchBarLocator);
       searchBarElement.sendKeys("Apple");

       Thread.sleep(3000);

       By searchButtonLocator =By.xpath("//button[@ type ='button']");
       WebElement searchButtonElement =driver.findElement(searchButtonLocator);
       searchBarElement.click();

       Thread.sleep(2000);

       By productLinkLocator =By.xpath("//div[@class ='ant-card-body']");
       WebElement productLinkElement = driver.findElement(productLinkLocator);
       productLinkElement.click();

       Thread.sleep(3000);

       driver.quit();






    }
}
