package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.cert.CertificateRevokedException;

public class Day3CssSelectorPracticeFirst {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        By signInButtonLocator = By.cssSelector("a#signinLink");
        WebElement signInButtonElement = driver.findElement(signInButtonLocator);
        signInButtonElement.click();

        Thread.sleep(1000);

        By emailInputLocator = By.cssSelector("input.login__input");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("wrongbenish.ranna@gmail.com");

        Thread.sleep(1000);

        By passwordInputLocator = By.cssSelector("input#password");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        passwordInputElement.sendKeys("wrongalameda123");

        Thread.sleep(1000);

        By loginButtonLocator = By.cssSelector("button#loginBtn");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.sendKeys();

        Thread.sleep(1000);

        By errorMessageLocator = By.cssSelector("div.error");
        WebElement errorMessage = driver.findElement(errorMessageLocator);

        System.out.println(errorMessage);

//        System.out.println(errorMessage.getText());
//
//        String error = errorMessage.getText();
//        System.out.println(error);

        Thread.sleep(1000);

        driver.quit();


    }

}
