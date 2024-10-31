package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.registry.LocateRegistry;
import java.time.Duration;

public class day3FirstActivityApplyingImplicitlyWait {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("//retail.tekschool-students.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


      By signInButtonLocater =By.cssSelector("a#signinLink");
        WebElement signInButtonElement = driver.findElement(signInButtonLocater);
        signInButtonElement.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        By accountButtonLocator =By.cssSelector("a#accountLink");
        WebElement accountElement =driver.findElement(accountButtonLocator);
        accountElement.click();
        WebDriverWait waitOne = new WebDriverWait(driver,Duration.ofSeconds(10));

        By phoneNumberInputLocator =By.cssSelector("input#personalPhoneInput");
        WebElement phoneNumberInputElement = driver.findElement(phoneNumberInputLocator);
        phoneNumberInputElement.sendKeys("4234232431");
        WebDriverWait waitTwo = new WebDriverWait(driver,Duration.ofSeconds(10));

       By updateButtonLocator = By.cssSelector("button#personalUpdateBtn");
       WebElement updateButtonElement = driver.findElement(updateButtonLocator);
       updateButtonElement.click();
        WebDriverWait waitThree = new WebDriverWait(driver,Duration.ofSeconds(10));


       driver.quit();












    }
}
