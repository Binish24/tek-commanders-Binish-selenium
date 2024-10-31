package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DayFourFirstActivity {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

        WebElement signInElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.linkText("Sign in")));
        signInElement.click();

        WebElement emailInputElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                       By.cssSelector("input#email")));
        emailInputElement.clear();
        emailInputElement.sendKeys("quinn.turner@example.com");

        WebElement passwordInputElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                 By.xpath("//input[@class ='ant-input ant-input-lg css-26oo3b']")));
        passwordInputElement.sendKeys("password123");

        WebElement signInButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span [text() ='Sign In']")));
        signInElement.click();

        WebElement accountButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class='ant-space-item']")));
        signInElement.click();

     driver.quit();
    }
}
