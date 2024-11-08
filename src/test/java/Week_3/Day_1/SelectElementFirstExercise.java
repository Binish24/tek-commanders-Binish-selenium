package Week_3.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectElementFirstExercise {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";

        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement languageDropDown = driver.findElement(By.id("programmingLanguageSelect"));

        Select selectLanguageDropDown = new Select(languageDropDown);

//        selectLanguageDropDown.selectByIndex(2);
//
//        selectLanguageDropDown.selectByVisibleText("java");


        selectLanguageDropDown.selectByValue("golang");

        Thread.sleep(2000);


        driver.quit();
    }
}
