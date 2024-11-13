package Week_4_Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Watchable;
import java.time.Duration;
import java.util.List;

public class fristActivity {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl ="https://retail.tekschool-students.com/selenium/radio";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        Thread.sleep(2000);

        WebElement smallRadioButton = driver.findElement(
                By.xpath("//label[text() ='Small']"));

        smallRadioButton.click();

        Thread.sleep(2000);

        if (smallRadioButton.isSelected()) {
            System.out.println("Yes, it is selected!");
        } else {
            System.out.println("No, it is not selected!");
        }

        Thread.sleep(2000);

        List<WebElement>radioButtons = driver.findElements(
                By.xpath("//input[@name ='tshirt']"));

        for (WebElement radioButton : radioButtons) {
            System.out.println(radioButton.getAttribute("value"));
        }

        Thread.sleep(2000);

        WebElement extraLargeRadioButton = driver.findElement(
                By.xpath("//label[text()='Extra Extra large']"));

        extraLargeRadioButton.click();

        Thread.sleep(5000);

        driver.close();
        driver.quit();


    }
}
