package Week_3.Day2_PromptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class promptAlertActivityFour {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl ="https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));

        WebElement promptAlertButton = driver.findElement(By.xpath("//button [@id ='promptBtn']"));

        promptAlertButton.click();


        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(1500);

        promptAlert.sendKeys("Good morning buddies!");

        Thread.sleep(1000);

        promptAlert.accept();

        Thread.sleep(5000);

       WebElement confirmationMessage = driver.findElement(By.xpath("//div[@id ='message']"));

       String text = confirmationMessage.getText();

        System.out.println(text);

        driver.close();
        driver.quit();


    }
}
