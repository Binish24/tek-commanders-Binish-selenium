package Week_3.Day4_Labsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingSelectElement_ActivityFirst {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement programmingLanguageDropDown = driver.findElement(
                By.xpath("//select[@name ='language']"));

        programmingLanguageDropDown.click();

        Select selectLanguageDropDown = new Select(programmingLanguageDropDown);

        selectLanguageDropDown.selectByVisibleText("golang");

        driver.close();
        driver.quit();


    }
}
