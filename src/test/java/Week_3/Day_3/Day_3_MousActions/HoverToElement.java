package Week_3.Day_3.Day_3_MousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverToElement {
    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = new EdgeDriver();
//        String baseUrl = "https://www.amazon.com/";
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement medicalCareButton = driver.findElement(By.xpath("//span[text() ='Medical Care']"));
//
//        Actions action = new Actions(driver);
//
//        action.moveToElement(medicalCareButton).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        /////$$$$$$$$$$$$$$$$$$$$$$$$/////////////######################///////@@@@@@@@@@@@@@@@@@@@/////@@@@@@@

//        WebDriver driver = new EdgeDriver();
//       String amazonUrl = "https://www.amazon.com/";
//        driver.get(amazonUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement primeButton = driver.findElement(By.xpath("//span[text() = 'Prime']"));
//
//        Actions action = new Actions(driver);
//
//        action.moveToElement(primeButton).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();


        /////###############\\\\\\@@@@@@@@@@@@@@@/////%%%%%%%%%%%%%%%%%\\\\&&&&&&&&&&&&&&&\\\\************\\\\

//        String amazonUrl = "https://www.amazon.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(amazonUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement groceries = driver.findElement(By.xpath("//span[text() ='Groceries']"));
//
//        Actions action = new Actions(driver);
//
//        action.moveToElement(groceries).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@==============@@@@@@@@@@@@@@@@@@@@@@@@@@================@@@@@@@@@@@@@@@@@@@@@@@@@

//        String amazonUrl = "https://www.amazon.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(amazonUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(1500);
//
//        WebElement medicalCareButton = driver.findElement(By.xpath("//span[text() ='Medical Care']"));
//
//        Actions action = new Actions(driver);
//
//        action.moveToElement(medicalCareButton).perform();
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();


        String amazonUrl = "https://www.amazon.com/";
        WebDriver driver = new EdgeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement groceries = driver.findElement(By.xpath("//span[text() ='Groceries']"));

        Actions action = new Actions(driver);

        action.moveToElement(groceries).perform();

        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }

}