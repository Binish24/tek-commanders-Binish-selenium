package Week_4_Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WorkingWithDateInput_ActivityThree {
    public static void main(String[] args) {

        String baseUrl ="https://retail.tekschool-students.com/selenium/inputs";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

       // WebElement dateInput = driver.findElement(By.xpath())


    }
}
