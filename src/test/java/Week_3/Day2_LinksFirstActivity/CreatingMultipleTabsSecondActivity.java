package Week_3.Day2_LinksFirstActivity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreatingMultipleTabsSecondActivity {

    final static String googleUrl = "https://www.google.com/";
    final static String facebookUrl ="https://www.facebook.com/";
    final static String tekschoolUrl ="https://retail.tekschool-students.com/";

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.get(googleUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);


        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/', '_blank')");

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/', '_blank')");

        Thread.sleep(3000);

        driver.quit();



    }


}
