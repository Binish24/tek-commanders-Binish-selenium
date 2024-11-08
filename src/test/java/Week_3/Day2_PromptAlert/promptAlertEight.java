package Week_3.Day2_PromptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class promptAlertEight {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl ="https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id ='promptBtn']"));
        promptAlertButton.click();

        Thread.sleep(1000);


        Alert promptAlert = driver.switchTo().alert();

        Thread.sleep(1000);

        promptAlert.sendKeys("Hello Buddies!");

        Thread.sleep(1000);

        promptAlert.accept();

        Thread.sleep(1000);

        WebElement confirmationAlert = driver.findElement(By.xpath("//div[@id ='message']"));

        String webText = confirmationAlert.getText();

        System.out.println(webText);

        if (("You wrote" + webText).equals(promptAlert)) {
            System.out.println("Test is passed!");
        } else {
            System.out.println("Test is failed!");
        }
    }
}
