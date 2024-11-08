package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWaitFirstExercise {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement signInElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a#signinLink")));
        signInElement.click();

        WebElement emailInputElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[name='email']")));
        emailInputElement.clear();
        emailInputElement.sendKeys("mahammad2536@gmail.com");

        WebElement passwordInputElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[name='password']")));
        passwordInputElement.sendKeys("password123");

        WebElement loginButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("#loginBtn")));
        loginButtonElement.click();

        WebElement accountButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a#accountLink")));
        accountButtonElement.click();

        WebElement phoneNumberInputElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("#personalPhoneInput")));
        passwordInputElement.clear();
        passwordInputElement.sendKeys("1231231234");

        WebElement updateButtonElement = wait .until(
                ExpectedConditions.elementToBeClickable(
                    By.cssSelector("button.account__btn-submit")));
        updateButtonElement.click();

        By toastifyMessage = By.cssSelector(".Toastify");
        WebElement toastifyElement = driver.findElement(toastifyMessage);

        System.out.println(toastifyElement.isDisplayed());

        driver.quit();

    }
}
