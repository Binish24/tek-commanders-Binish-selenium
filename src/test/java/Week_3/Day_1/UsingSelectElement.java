package Week_3.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingSelectElement {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

//        String baseUrl ="https://retail.tekschool-students.com/selenium/dropdown";
//        driver.get(baseUrl);

        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement selectCountryDropDown = driver.findElement(By.id("countrySelect"));
       // WebElement selectCountryDropDownTwo = driver.findElement(By.className("bg-gray-100 p-2"));

        selectCountryDropDown .click();

        Thread.sleep(2000);

        driver.close();
        driver.quit();




    }
}
