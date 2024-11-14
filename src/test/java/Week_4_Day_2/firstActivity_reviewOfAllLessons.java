package Week_4_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstActivity_reviewOfAllLessons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Actions action = new Actions(driver);

        Thread.sleep(3000);

        WebElement signInLocator = driver.findElement(
                By.xpath("//a[@id ='signinLink']"));
        action.click(signInLocator).perform();


        Thread.sleep(3000);

        WebElement subTitle = driver.findElement(
                By.xpath("//h1[@class='login__subtitle']"));
        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(3000);

        WebElement createNewAccountLocator = driver.findElement(
                By.xpath("//a[@id ='newAccountBtn']"));

        action.click(createNewAccountLocator).perform();

        Thread.sleep(3000);

        WebElement signUpLocator = driver.findElement(
                By.xpath("//h1[@class ='signup__subtitle']"));

        String signUpTitle = driver.getTitle();
        System.out.println(signUpTitle);

        Thread.sleep(3000);

        WebElement nameInputLocator = driver.findElement(
                By.xpath("//input[@name ='name']"));
        nameInputLocator.sendKeys("Benish");

        Thread.sleep(3000);

        WebElement emailInputLocator = driver.findElement(
                By.xpath("//input[@id = 'emailInput']"));
        emailInputLocator.sendKeys("benish.aalam@gmail.com");

        Thread.sleep(3000);

        WebElement passwordInputLocator = driver.findElement(
                By.xpath("//input[@id = 'passwordInput']"));
        passwordInputLocator.sendKeys("tekSchool123@@");

        Thread.sleep(3000);

        WebElement confirmPasswordLocator = driver.findElement(
                By.xpath("/input[@id = 'confirmPasswordInput']"));
        confirmPasswordLocator.sendKeys("tekSchool123@@");

        Thread.sleep(3000);

        WebElement signUpButton = driver.findElement(
                By.xpath("//button[@class = 'signup__btn']"));
       signUpButton.click();

        Thread.sleep(3000);

        WebElement accountButton = driver.findElement(
                By.xpath("//a[@id ='accountLink']"));
        accountButton.click();

        Thread.sleep(3000);

        WebElement profileText = driver.findElement(
                By.xpath("//h1[text()='Your Profile']"));
        String profileTitle = driver.getTitle();
        System.out.println(profileTitle);

        Thread.sleep(3000);

        WebElement phoneNumber =driver.findElement(
                By.xpath("//input[@name ='phoneNumber']"));
        phoneNumber.sendKeys("3123312322");

        Thread.sleep(3000);

        WebElement updateButton = driver.findElement(
                By.xpath("//button [@id ='personalUpdateBtn']"));

        Thread.sleep(3000);

        driver.close();
        driver.quit();



    }
}
