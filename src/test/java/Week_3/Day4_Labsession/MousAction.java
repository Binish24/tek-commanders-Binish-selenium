package Week_3.Day4_Labsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MousAction {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        String amazonUrl = "https://www.amazon.com/";
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement primeButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href ='https://www.amazon.com/prime?ref_=nav_cs_primelink_nonmember']")));
                primeButton.click();


                driver.close();
                driver.quit();

    }
}
