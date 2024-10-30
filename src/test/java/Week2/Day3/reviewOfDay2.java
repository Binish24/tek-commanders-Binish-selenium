package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class reviewOfDay2 {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By signInButtonLocator = By.cssSelector("a#signinLink");
        WebElement signInButtonElement =driver.findElement(signInButtonLocator);
        signInButtonElement.click();

        Thread.sleep(3000);

       By emailLocator = By.cssSelector("input.login__input");
       WebElement emailElement = driver.findElement(emailLocator);
       signInButtonElement.sendKeys("benish.ranna@gmail.com");

       Thread.sleep(3000);

      By passwordLocator = By.cssSelector("input#password");
      WebElement passwordElement = driver.findElement(passwordLocator);
      passwordElement.sendKeys("wrongPassword122");

      Thread.sleep(3000);

      By loginButtonLocator =By.cssSelector("button.login__invalid");
      WebElement loginElement = driver.findElement(loginButtonLocator);
      loginElement.click();

      By errorMessageLocator = By.cssSelector("div.error");
      WebElement errorMessageElement = driver.findElement(errorMessageLocator);
      errorMessageElement.getText();

      Thread.sleep(1000);

      driver.quit();
    }
}
