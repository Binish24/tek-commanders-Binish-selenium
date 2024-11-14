package Week_4_Day_1_CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class firstActivity_CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        Thread.sleep(2000);

        WebElement javaLanguage = driver.findElement(
                By.xpath("//input[@id ='javaInput']"));

        //javaLanguage.click();
        action.click(javaLanguage).perform();

        //THIS IS USE FOR SPECIFIC CONDITION AND Target, like below!!!!!
        //WebElement checkBoxes = driver.findElement(
        // By.xpath("//div[@id ='firstQuestion']//input[@name ='java']"));

        Thread.sleep(2000);

        driver.close();
        driver.quit();



    }
}
