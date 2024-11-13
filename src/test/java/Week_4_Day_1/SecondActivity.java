package Week_4_Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SecondActivity {
    public static void main(String[] args) throws InterruptedException {


        String baseUrl ="https://retail.tekschool-students.com/selenium/checkbox";
        WebDriver driver =  new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Actions action = new Actions(driver);

        Thread.sleep(2000);

        List<WebElement>  interestCheckBoxes = driver.findElements(
                By.xpath("//div[@class ='flex gap-3']//input"));

        Thread.sleep(2000);

        for (WebElement interestsCheckBox : interestCheckBoxes) {
            action.click(interestsCheckBox).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }

}
