package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingImplicitWaitFirstExercise {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        By signInButtonLocator = By.cssSelector(".top-nav__btn");
        WebElement signInElement = driver.findElement(signInButtonLocator);
        signInElement.click();

        By emailInputLocator = By.cssSelector("input[name='email']");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        signInElement.sendKeys("mohammad2536@gmail.com");

        By passwordInputLocator = By.cssSelector("#password");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        signInElement.sendKeys("Password@123");

        By loginButtonLocator = By.cssSelector("#loginBtn");
        WebElement loginButtonElment = driver.findElement(loginButtonLocator);
        loginButtonElment.click();

        By accountButtonLocator = By.cssSelector(".top-nav__btn");
        WebElement accountButtonElement = driver.findElement(accountButtonLocator);
        loginButtonElment.click();


        By phoneNumberInputLocator = By.cssSelector("#personalPhoneInput");
        WebElement phoneNumberInputElement = driver.findElement(phoneNumberInputLocator);
        phoneNumberInputElement.sendKeys("1234567810");

        By updateButtonLocator = By.cssSelector("button[type='submit']");
        WebElement updateButtonElement = driver.findElement(updateButtonLocator);
        phoneNumberInputElement.click();

        By toastifyMessage = By.cssSelector(".Toastify");
        WebElement toastifyElement = driver.findElement(toastifyMessage);

//        System.out.println(toastifyElement);

//        String text = toastifyElement.getText();
//        System.out.println(text);


        driver.quit();
    }
}
