package Week1.ActivityDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathExample {

    public static void main(String[] args) throws InterruptedException {

//        ChromeDriver driver = new ChromeDriver ();
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//      By logoLocator =  By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
//        WebElement logoElement = driver.findElement(logoLocator);
//        String textLogo = logoElement.getText();
//        System.out.println(textLogo);
//
//        Thread.sleep(2000);
//
//        driver.quit();
//
        ChromeDriver driverOne = new ChromeDriver();
        driverOne.get("https://naraiman.com/");
        driverOne.manage().window().maximize();

        String titleText = driverOne.getTitle();
        System.out.println(titleText);

        Thread.sleep(3000);

       By logoLocator = By.xpath("/html/body/header/div/div/a");
       WebElement logoElement = driverOne.findElement(logoLocator);
      // logoElement.click();

        String text = logoElement.getText();
        System.out.println(text);

        driverOne.quit();






    }

}
