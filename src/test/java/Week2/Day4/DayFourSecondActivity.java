package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DayFourSecondActivity {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text() = 'Sign in']")));
        signInButton.click();

        WebElement registerHereElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("ant-btn css-26oo3b ant-btn-default ant-btn-lg")));
        registerHereElement.click();

        WebElement firstNameInputElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input#firstName")));
        firstNameInputElement.sendKeys("Nabiullah");

        WebElement lastNameElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input#lastName")));
        lastNameElement.sendKeys("Benish");

        WebElement emailInputElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                     By.cssSelector("input#email")));
        emailInputElement.sendKeys("mohammad2536@gmail.com");

        WebElement passwordInputElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input#password")));
        passwordInputElement.sendKeys("password1234");

        WebElement confirmPassInputElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input#confirmPassword")));
        confirmPassInputElement.sendKeys("password1234");

        WebElement submitButtonElement= wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("/span[text() ='Submit']")));
        submitButtonElement.sendKeys();

        WebElement emailInputElementOne = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input#email")));
        emailInputElementOne.sendKeys("mohammad2536@gmail");

        WebElement passwordInputElementOne = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input#password")));
        passwordInputElementOne.sendKeys("password@123");

        WebElement signInInputElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("//span[text()='Sign In']")));
        signInInputElement.click();
//
//        String userName = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector("//span[@class='ant-dropdown-menu-title-content']")));











    }
}
