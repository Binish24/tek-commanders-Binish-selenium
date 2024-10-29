package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeekTwoDayFirstRecap {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String text = driver.getTitle();
        System.out.println(text);

        Thread.sleep(3000);

      By searchBarLocator = By.id("searchInput");
     WebElement searchElement = driver.findElement(searchBarLocator);
     searchElement.sendKeys("TV");

     Thread.sleep(2000);

     By searchLocator =By.xpath("/html/body/div/div/div/div/div/div[2]div/input");
     WebElement searchloginElement = driver.findElement(searchLocator);
     searchloginElement.click();





    }
}
