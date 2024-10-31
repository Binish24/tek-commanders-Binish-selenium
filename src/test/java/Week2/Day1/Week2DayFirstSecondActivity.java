package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Week2DayFirstSecondActivity {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

       By nameLocator = By.xpath("//input[@class ='signup__input']");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("name.gmail.come");

        Thread.sleep(2000);
        



    }
}
