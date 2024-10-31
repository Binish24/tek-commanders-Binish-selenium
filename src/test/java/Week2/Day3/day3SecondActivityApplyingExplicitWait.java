package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class day3SecondActivityApplyingExplicitWait {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("//retail.tekschool-students.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        By signInButtonLocater =By.cssSelector("a#signinLink");
        WebElement signInButtonElement = driver.findElement(signInButtonLocater);
        signInButtonElement.click();

        By accountButtonLocator =By.cssSelector("a#accountLink");
        WebElement accountElement =driver.findElement(accountButtonLocator);
        accountElement.click();

        By phoneNumberInputLocator =By.cssSelector("input#personalPhoneInput");
        WebElement phoneNumberInputElement = driver.findElement(phoneNumberInputLocator);
        phoneNumberInputElement.sendKeys("4234232431");

        By updateButtonLocator = By.cssSelector("button#personalUpdateBtn");
        WebElement updateButtonElement = driver.findElement(updateButtonLocator);
        updateButtonElement.click();


        driver.quit();
    }
}
