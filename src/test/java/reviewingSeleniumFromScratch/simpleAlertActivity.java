package reviewingSeleniumFromScratch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class simpleAlertActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement alertButton = driver.findElement(By.xpath("//button[@id = 'alertBtn']"));
        alertButton.click();

        Thread.sleep(1500);

//        Alert alert = driver.switchTo().alert();
//        String textOnAlert = driver.getTitle();
//        System.out.println(textOnAlert);
//
//        Thread.sleep(1500);

        driver.close();
        driver.quit();

    }
}
