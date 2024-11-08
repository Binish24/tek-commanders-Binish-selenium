package Week_3.Day2_ConfirmAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class confirmationAlertActivityTwo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl ="https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();


        WebElement confirmAlertButton = driver.findElement(By.xpath("//button[text() ='Confirm']"));

        confirmAlertButton.click();


        Alert confirmButton = driver.switchTo().alert();

        Thread.sleep(2000);

        confirmButton.dismiss();

        Thread.sleep(2000);
        ///confirmButton.accept();

        driver.close();

        driver.quit();
    }
}
