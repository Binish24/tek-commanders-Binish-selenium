package Week_3.Day_1;

import Week2.Day4.SeleniumUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WorkingWithSelectElement {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        // driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Thread.sleep(1000);

        WebElement selectYourCountryDropDown = driver.findElement(By.id("countrySelect"));

        Select countrySelectDropDown = new Select(selectYourCountryDropDown);

        countrySelectDropDown.selectByVisibleText("United States");
        //countrySelectDropDown.getAllSelectedOptions(
        //  "United States", "Afghanistan", "Cuba", "India", "United Arab Emirates");

        Thread.sleep(1000);

        countrySelectDropDown.selectByValue("Cuba");

        Thread.sleep(1000);

        List<WebElement> options = countrySelectDropDown.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        countrySelectDropDown.selectByIndex(4);


            Thread.sleep(1000);

            driver.close();
            driver.quit();


    }
}
