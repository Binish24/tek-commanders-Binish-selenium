package Week_3.Day2_PromptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class promptAlertActivityThree {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement promptAlertButton = driver.findElement(
                By.xpath("//button[text() = 'Prompt']"));
        promptAlertButton.click();

        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(1000);

        promptAlert.sendKeys("Hello United States of America!");

        Thread.sleep(1500);

        promptAlert.accept();

        Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
