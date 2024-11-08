package Week_3.Day2_SimpleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class simpleAlert_FirstActivity {
    public static void main(String[] args) throws InterruptedException {

      EdgeDriver driver = new EdgeDriver();

      String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
      driver.get(baseUrl);
      //driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
      driver.manage().window().maximize();

//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));



//        WebElement simpleAlert = driver.findElement(
//                By.xpath("//button[contains(@class, 'bg-blue-800')]"));
//
//        simpleAlert.click();

        WebElement alertButton = driver.findElement(By.id("alertBtn"));

        Thread.sleep(1000);

        alertButton.click();

        Thread.sleep(2000);

        Alert alertSimpleButton = driver.switchTo().alert();

        System.out.println("Text of the alert: " + alertSimpleButton.getText());

        Thread.sleep(2000);

        alertSimpleButton.accept();

        Thread.sleep(2000);


        driver.close();
        driver.quit();

    }
}
