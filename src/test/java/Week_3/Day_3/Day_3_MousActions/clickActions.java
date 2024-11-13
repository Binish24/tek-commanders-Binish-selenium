package Week_3.Day_3.Day_3_MousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class clickActions {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String dropDownUrl = "https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(dropDownUrl);
        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        Thread.sleep(1000);


        driver.close();
        driver.quit();



    }

    }

//WebElement selectProgrammingLangDropDown = driver.findElement(
//        By.xpath("//select[@id ='programmingLanguageSelect']"));
//        selectProgrammingLangDropDown.click();
//
//
//        Thread.sleep(1500);