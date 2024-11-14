package Week_4_Day_1_CheckBoxes;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class secondActivity_ListOfCheckBoxes {
    public static void main(String[] args) throws InterruptedException {

//      String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
//      WebDriver driver = new EdgeDriver();
//      driver.get(baseUrl);
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//      Actions action = new Actions(driver);
//
//      Thread.sleep(1000);
//
//      List<WebElement> listCheckBoxes = driver.findElements(By.xpath("//div[@id ='firstQuestion']//input"));
//
//      for (WebElement checkBox : listCheckBoxes ) {
//          action.click(checkBox).perform();
//          Thread.sleep(1000);
//      }
//      Thread.sleep(2000);
//
//                driver.close();
//                driver.quit();


        /////^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\


//        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Actions action = new Actions(driver);
//
//        Thread.sleep(1000);
//
//        WebElement interestCheckBox = driver.findElement(
//                By.id("movieInput"));
//
//        action.click(interestCheckBox).perform();
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();


        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\\\^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\^^^^^^^^^^^^^^^\\\

//        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Actions action = new Actions(driver);
//
//        Thread.sleep(1000);
//
//        WebElement interestCheckBox = driver.findElement(
//                By.id("movieInput"));
//
//        action.click(interestCheckBox).perform();
//
//        Thread.sleep(2000);
//
//        List<WebElement> listOfInterestCheckBoxes = driver.findElements(
//                By.xpath("//fieldset[@id ='secondQuestion']//input"));
//
//        for (WebElement interestOfCheckBox :listOfInterestCheckBoxes) {
//            System.out.println(interestOfCheckBox.getAttribute("value"));
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ///^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\^^^^^^^^\\\

//        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
//
//      WebDriver driver = new EdgeDriver();
//      driver.get(baseUrl);
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//      Actions action = new Actions(driver);
//
//      Thread.sleep(1000);
//
//      List<WebElement> listCheckBoxes = driver.findElements(By.xpath("//div[@id ='firstQuestion']//input"));
//
//      for (WebElement checkBox : listCheckBoxes ) {
//          action.click(checkBox).perform();
//          Thread.sleep(1000);
//      }
//               Thread.sleep(2000);
//
//                driver.close();
//                driver.quit();

        //////////*********************************************************************\\\\\\\\\\\\\\\\\\\


//        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        Actions action = new Actions(driver);
//
//        Thread.sleep(2000);
//
//       List <WebElement> listOfInterestCheckBoxes = driver.findElements(
//               By.xpath("//div[@class='flex gap-3']//input"));
//
//       for (WebElement interestOfCheckBoxes : listOfInterestCheckBoxes) {
//           action.click(interestOfCheckBoxes).perform();
//
//           Thread.sleep(2000);
//
//       }
//
//       Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\

        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions action = new Actions(driver);


        Thread.sleep(2000);

       List <WebElement> listOfLanguageCheckBoxes = driver.findElements(
                By.xpath("//div[@id ='firstQuestion']//input"));

       for (WebElement languageCheckBox : listOfLanguageCheckBoxes) {
           action.click(languageCheckBox).perform();

           Thread.sleep(2000);

       }

       Thread.sleep(3000);

       driver.close();
       driver.quit();




    }
}
