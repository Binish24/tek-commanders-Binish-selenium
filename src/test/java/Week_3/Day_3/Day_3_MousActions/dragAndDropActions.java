package Week_3.Day_3.Day_3_MousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropActions {
    public static void main(String[] args) throws InterruptedException {

//        String dragAndDropUrl ="https://retail.tekschool-students.com/selenium/drag-drop";
//        WebDriver  driver = new EdgeDriver();
//        driver.get(dragAndDropUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(1500);
//
//        WebElement source = driver.findElement(By.xpath("//div[contains(text(),'Payment should not accept')]"));
//        WebElement target = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));
//
//
//        Actions action = new Actions(driver);
//
//       // action.click(source).perform();
//
//        action.clickAndHold(source).
//        moveByOffset(0,10).
//        moveToElement(target).
//        release().
//                perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();


//        ********************              **********************             **********************

//        WebDriver driver = new EdgeDriver();
//        String dragAndDropUrl = "https://retail.tekschool-students.com/selenium/drag-drop";
//        driver.get(dragAndDropUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        WebElement source = driver.findElement(
//                By.xpath("//div[contains(text(), 'In checkout page user should')]"));
//
//        WebElement destination = driver.findElement(
//                By.xpath("//div[@data-rbd-droppable-id='2']"));
//
//        Actions action = new Actions(driver);
//
//        action.clickAndHold(source).
//                moveByOffset(0,10).
//                moveToElement(destination).
//                release().
//                perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        ///@@@@@@@@@@@@@@@@@@@@@@@@@/////@@@@@@@@@@@@@@@@@@@@@@@////@@@@@@@@@@@@@@@@@@@@@@@/////@@@@@@@@@@@@////

//        WebDriver driver= new EdgeDriver();
//        String dragAndDropUrl = "https://retail.tekschool-students.com/selenium/drag-drop";
//        driver.get(dragAndDropUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        WebElement source = driver.findElement(
//                By.xpath("//div[contains(text(), 'After Item is removed from cart. total price')]"));
//
//        WebElement target = driver.findElement(
//                By.xpath("//div[@data-rbd-droppable-id='2']"));
//
//        Thread.sleep(2000);
//
//        Actions action = new Actions(driver);
//
//        action.clickAndHold(source).                    ///click and hold the source
//                moveByOffset(0,10).     //// move to the lift or right side
//                moveToElement(target).                  /// move the element to the destination
//                release().                              //release the object or the source
//                perform();                              // perform
//
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        ///&&&&&&&&&&&&&&&&&&&&\\\\\\\&&&&&&&&&&&&&&&&&&&&&\\\\\&&&&&&&&&&&&&&&&&\\\\&&&&&&&&&&&&&&&&&

//        WebDriver driver =new EdgeDriver();
//        String baseUrl = "https://retail.tekschool-students.com/selenium/drag-drop";
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        WebElement source = driver.findElement(
//                By.xpath("//div [text() ='Full Name should not accept invalid characters']"));
//        WebElement destination = driver.findElement(
//                By.xpath("//div[@data-rbd-droppable-id='2']"));
//
//        Thread.sleep(3000);
//
//        Actions action = new Actions(driver);
//
//        action.clickAndHold(source).
//                moveByOffset(0,10).
//                moveToElement(destination).
//                release().
//                perform();
//
//        Thread.sleep(3000);
//
//
//        driver.close();
//        driver.quit();

        ///&&&&&&&&&&&&&&&&&&&&&&\\\&&&&&&&&&&&&&&&///&&&&&&&&&&&&&&&&&&///&&&&&&&&&&&&&&&&&&///&&&&&&&&&&&&&&&&&&

        WebDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/drag-drop");
        driver.manage().window().maximize();


        Thread.sleep(2000);


        WebElement source = driver.findElement(
                By.xpath("//div[contains(text(), 'Full Name should not accept')]"));

        WebElement target = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));

        Thread.sleep(1500);

        Actions action = new Actions(driver);

        action.clickAndHold(source).
                moveByOffset(0,10).
                moveToElement(target).
                release().
                perform();

        Thread.sleep(2000);

        driver.close();
        driver.quit();









    }
}
