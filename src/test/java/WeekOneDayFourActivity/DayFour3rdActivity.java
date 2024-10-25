package WeekOneDayFourActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFour3rdActivity {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(2000);

        By signInLocator =By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        Thread.sleep(1000);

        By emailLocator= By.id("email");
        WebElement emailElement = driver.findElement(emailLocator);
        signInElement.sendKeys("WrongEmail.input@gmail.com");

        Thread.sleep(1000);

        By passwordLocator = By.id("password");
        WebElement passElement = driver.findElement(passwordLocator);
        passElement.sendKeys("wrongpassword12");

        Thread.sleep(1000);

        By signinButtonLocator =By.className("ant-btn");
        WebElement signInButtonElement= driver.findElement(signinButtonLocator);
        signInButtonElement.click();

        Thread.sleep(1000);

       By errorMessageLocator = By.className("ant-alert-message");
       WebElement errorMessageElement = driver.findElement(errorMessageLocator);
       errorMessageElement.click();

       Thread.sleep(1000);

       driver.quit();






    }
}
