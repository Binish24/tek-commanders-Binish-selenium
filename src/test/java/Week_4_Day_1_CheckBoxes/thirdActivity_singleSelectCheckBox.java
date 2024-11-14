package Week_4_Day_1_CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class thirdActivity_singleSelectCheckBox {
    public static void main(String[] args) throws InterruptedException {

//        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        Actions action = new Actions(driver);
//
//        Thread.sleep(2000);
//
//        WebElement singleCheckBoxes = driver.findElement(
//                By.xpath("//input[@id ='goInput']"));
//
//        action.click(singleCheckBoxes).perform();
//
//        Thread.sleep(2000);
//
//        List<WebElement> listOfCheckBoxes = driver.findElements(
//                By.xpath("//input[@type ='checkbox']"));
//        System.out.println(listOfCheckBoxes);
//
//        Thread.sleep(3000);
//
//
//        driver.close();
//        driver.quit();


        //*********************************************************************************************\\\\

//        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//
//        Thread.sleep(2000);
//
//        WebElement singleCheckBox = driver.findElement(
//                By.xpath("//input[@id ='goInput']"));
//
//        Actions action = new Actions(driver);
//
//        action.click(singleCheckBox).perform();
//
//        Thread.sleep(2000);
//
//        if (singleCheckBox.isSelected()) {
//            System.out.println(" Yes, it is selected!");
//        } else System.out.println("No, it is not selected!");
//
//
//        Thread.sleep(2000);
//
//        List< WebElement> checkBoxes = driver.findElements(
//                By.xpath("//div[@id='firstQuestion']//input[@type ='checkbox']"));
//
//        for (WebElement checkBox : checkBoxes) {
//            System.out.println(checkBox.getAttribute("value"));
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ////***************************************************************************************\\\\\\\\

//        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        Actions action = new Actions(driver);
//
//
//        WebElement interestCheckBox = driver.findElement(
//                By.xpath("//input[@id ='musicInput']"));
//
//        action.click(interestCheckBox).perform();
//
//        List<WebElement> listOfInterestCheckBoxes = driver.findElements(
//                By.xpath("//fieldset [@id ='secondQuestion']//input"));
//
//        for (WebElement checkBoxes : listOfInterestCheckBoxes)  {
//            System.out.println(checkBoxes.getAttribute("value"));
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ///&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\\\\\

//        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
//        WebDriver driver = new EdgeDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
//        Thread.sleep(1000);
//
//        WebElement programmingLanguageCheckBox = driver.findElement(
//                By.xpath("//input[@id ='cSharpInput']"));
//
//        Actions action = new Actions(driver);
//
//        action.click(programmingLanguageCheckBox).perform();
//
//        Thread.sleep(3000);
//
//        List<WebElement> programmingLanguageCheckBoxes = driver.findElements(
//                By.xpath("//div[@id ='firstQuestion']//input"));
//
//        for (WebElement languageCheckBox : programmingLanguageCheckBoxes) {
//            System.out.println(languageCheckBox.getAttribute("value"));
//        }
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();

        //****************************************************************************************************\\\\

        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions action = new Actions(driver);



        WebElement languageCheckBoxes = driver.findElement(
                By.xpath("//input[@id ='javascriptInput']"));

        action.click(languageCheckBoxes).perform();

        List <WebElement> listLanguageCheckBoxes = driver.findElements(
                By.xpath("//div[@id ='firstQuestion']//input"));

        for(WebElement listOfCheckBoxes : listLanguageCheckBoxes) {
            System.out.println(listOfCheckBoxes.getAttribute("value"));
        }

        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
