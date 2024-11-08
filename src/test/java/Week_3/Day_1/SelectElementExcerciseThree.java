package Week_3.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectElementExcerciseThree {
    public static void main(String[] args) throws InterruptedException {


        EdgeDriver driver = new EdgeDriver();

        //driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        String baseUrl ="https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(baseUrl);
        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        Thread.sleep(1000);

        WebElement countryDropDown = driver.findElement(By.name("country"));

        Select selectCountryDropDown = new Select(countryDropDown);

        List<WebElement> selectOptions = selectCountryDropDown.getAllSelectedOptions();

        selectCountryDropDown.selectByVisibleText("Afghanistan");

        Thread.sleep(2000);

        selectCountryDropDown.selectByValue("India");

        Thread.sleep(2000);

        selectCountryDropDown.selectByIndex(2);

        Thread.sleep(2000);


        for (WebElement selectOption : selectOptions){
            System.out.println(selectOption.getText());
        }

        Thread.sleep(2000);

        driver.quit();
        driver.close();

    }
}
