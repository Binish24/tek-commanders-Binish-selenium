package Week_3.Day_3.Day_3_MousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClickAction {
    public static void main(String[] args) throws InterruptedException {

//        String baseUrl = "https://retail.tekschool-students.com/selenium/drag-drop";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        WebElement source = driver.findElement(
//                By.xpath("//div[contains(text(), 'After Item is removed from cart. total')]"));
//
//        Actions action = new Actions(driver);
//
//        action.contextClick(source).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();



        ///&&&&&&&&&&&&&&&&\\\\\\\\\*****************//////////*****************\\\\\\\\\%%%%%%%%%%%%%\\\\\

        String baseUrl ="https://retail.tekschool-students.com/selenium/drag-drop";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement dragAndDrop = driver.findElement(
                By.xpath("//div[contains(text(), 'In checkout page user should be able')]"));

        Actions action = new Actions(driver);

        action.contextClick(dragAndDrop).perform();

        Thread.sleep(2000);

        driver.close();
        driver.quit();








    }
}
