package Week_3.Day2_PromptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class promptAlertActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl ="https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promptBtn']"));

        promptAlertButton.click();

        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(1000);

        promptAlert.sendKeys("Good Afternoon!");

        Thread.sleep(1000);

        promptAlert.accept();

       WebElement confirmationText = promptAlertButton.findElement(By.xpath("//div[@id ='message']"));
       String webText = confirmationText.getText();
       System.out.println(webText);




        Thread.sleep(3000);


        driver.close();
        driver.quit();
    }
}
