package Week_3.Day_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java .util.ArrayList;
import java.util.List;


public class day3_FirstActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        driver.get(baseUrl);

        Thread.sleep(3000);

        (( JavascriptExecutor ) driver).executeScript("window.open('https://www.bbc.com/news', '_blank')");

        Thread.sleep(3000);

        (( JavascriptExecutor ) driver).executeScript("window.open('https://www.bbc.com/news', '_blank')");

        Thread.sleep(3000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(0));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(3000);

        for ( String tab : tabs ) {
            driver.switchTo().window(tab);
            driver.close();
        }

        driver.quit();


    }
}
