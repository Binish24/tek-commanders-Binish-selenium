package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativeXpathOct29ExampleTwo {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       driver.findElement( By.xpath("//a[@class='top-nav__logo active']")).click();

       Thread.sleep(2000);

       driver.findElement(By.xpath(
               "//input[contains(@class ='login__input')]"))
                .sendKeys("benish.ranna@gmail.com");
       driver.findElement(By.xpath("//input[@id ='password']"))
               .sendKeys("WrongPassword");
       driver.findElement(By.xpath("//button[contains(@class = 'login__submit')]"))
               .click();

      By logoutButtonLocator = By.xpath("//button[contains(text(), 'Log out')]");
      WebElement logoutButtonElement = driver.findElement(logoutButtonLocator);
      logoutButtonElement.click();

        //      boolean isLogOutDisplayed =driver.findElement(By.xpath("//button[contains(text()), 'Log out')]"))
        //      .isDisplayed();


       if (logoutButtonElement.isDisplayed()) {
           System.out.println("The operation is successfully passed");
       } else {
           System.out.println("The operation was not successfully");
       }


       //Note we can use the last System.out.println("") out of the Block sign!!!

       Thread.sleep(3000);

       driver.quit();


    }
}
