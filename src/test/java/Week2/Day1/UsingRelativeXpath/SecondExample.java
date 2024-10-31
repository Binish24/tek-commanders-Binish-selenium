package Week2.Day1.UsingRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class SecondExample {

    public static void main(String[] args) throws InterruptedException {

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.bbc.com/news");
//        driver.manage().window().maximize();
//
////        String text = driver.getTitle();
////        System.out.println(text);
//
//        Thread.sleep(2000);
//
//     By besinessButtonLocator =By.xpath("//a[text () = 'Business']");
//        WebElement besinessButtonElement= driver.findElement(besinessButtonLocator);
//        besinessButtonElement.click();
//
//
//       By textTitleLocator = By.xpath("//h1[text() = 'Business']");
//       WebElement textTitleElement = driver.findElement(textTitleLocator);
//        String text = driver.getTitle();
//        System.out.println(text);
//
//        Thread.sleep(3000);
//        driver.quit();

        WebDriver driver = new ChromeDriver();
        driver.get("https://naraiman.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By homePageTabLocator = By.xpath("//a[text() ='خانه']");
       WebElement homePageTabElement = driver.findElement(homePageTabLocator);
       homePageTabElement.click();

       Thread.sleep(3000);

       By textTitleLocator = By.xpath("//h3[text() ='یادداشت']");
       WebElement textTitleElement = driver.findElement(textTitleLocator);
       String textTitle = driver.getTitle();
        System.out.println(textTitle);

        Thread.sleep(3000);

        driver.quit();



    }
}
