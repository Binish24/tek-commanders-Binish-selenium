package Week_3.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectElementExcersiceTwo {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement websitesLanguageDropDown = driver.findElement(By.id("languageSelect"));

        Thread.sleep(1000);

        Select selectWebsitesLanguageDropDown = new Select(websitesLanguageDropDown);

        Thread.sleep(1000);

       // selectWebsitesLanguageDropDown.selectByValue("Persian");

       // selectWebsitesLanguageDropDown.selectByVisibleText("German");

       List<WebElement> options =selectWebsitesLanguageDropDown.getOptions();


        for (WebElement option : options) {

            System.out.println(option.getText());
        }

        Thread.sleep(1000);

        driver.quit();
    }
}
