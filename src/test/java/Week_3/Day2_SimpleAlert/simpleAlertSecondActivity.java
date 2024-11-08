package Week_3.Day2_SimpleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class simpleAlertSecondActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement simpleAlertButton = driver.findElement(
                By.xpath("//button [contains(@class,'text-blue-100')]"));

        simpleAlertButton.click();

        Thread.sleep(1000);

        Alert alertButton = driver.switchTo().alert(); ///Alert is a class

        System.out.println("Text of the alert: "  + alertButton.getText());

        Thread.sleep(2000);

        alertButton.accept();

        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
