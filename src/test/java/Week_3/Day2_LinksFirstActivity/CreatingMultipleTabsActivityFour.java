package Week_3.Day2_LinksFirstActivity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class CreatingMultipleTabsActivityFour {

    final static String tekschoolUrl ="https://retail.tekschool-students.com/";
    final static String facebookUrl="https://www.facebook.com/";
    final static String googleUrl ="https://www.google.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get(tekschoolUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/', '_blank')");

        Thread.sleep(3000);

        ((JavascriptExecutor)driver).executeScript("window.open ('https://www.google.com/', '_blank')");

        Thread.sleep(3000);

        List <String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(0));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(3000);

        for (String tab : tabs) {

            driver.switchTo().window(tab);
            driver.close();

        }



        driver.quit();

    }
}
