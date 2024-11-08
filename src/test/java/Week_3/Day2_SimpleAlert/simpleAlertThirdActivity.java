package Week_3.Day2_SimpleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class simpleAlertThirdActivity {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement alertButton = driver.findElement(
                By.xpath("//button [contains(@class, 'hover:bg-blue-700')]"));
        alertButton.click();

        Thread.sleep(1000);

        Alert simpleAlertButton = driver.switchTo().alert();

        System.out.println("Text of the alert: " + simpleAlertButton.getText());

        Thread.sleep(2000);

        simpleAlertButton.accept();

        driver.close();
        driver.quit();
    }
}
