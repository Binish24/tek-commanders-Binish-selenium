package Week1.WeekOneDayFourActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DayFourThirdActivity {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(5000);


       By searchLocator = By.className("ant-input");
       WebElement searchElement = driver.findElement(searchLocator);
       searchElement.sendKeys("Apple");

       By searchButLocator = By.className("ant-btn");
        WebElement searchButElement =driver.findElement(searchButLocator);
        searchButElement.click();

        Thread.sleep(4000);

        By allLocators = By.className("products__layout");
        List<WebElement> searchElements = driver.findElements(allLocators);

        int itemsNumber = searchElements.size();

        System.out.println(itemsNumber);

        if (itemsNumber == 3) {
            System.out.println("number of searched items is equal to three");
        } else {
            System.out.println("More than three items displayed");
        }
        driver.quit();













    }
}
