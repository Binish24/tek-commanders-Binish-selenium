package Week_3.Day2_PromptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class promptAlertActivitySix {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

       // driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");

        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id ='promptBtn']"));
        promptAlertButton.click();

        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(1000);

        promptAlert.sendKeys("Hello Humans!");

        Thread.sleep(1000);

        promptAlert.accept();

        Thread.sleep(1000);

        WebElement confirmationAlert = driver.findElement(
                By.xpath("//div[text() ='You wrote Hello Humans!']"));

        //confirmationAlert.getText();
        String webText = confirmationAlert.getText();
        System.out.println(webText);

        Thread.sleep(3000);

        if (("You wrote " + webText) .equals(promptAlert)) {
            System.out.println("Text is passed");
        } else System.out.println("Test is failed!");

        Thread.sleep(1000);

        driver.close();

        driver.quit();


    }
}
