package Week_3.Day4_Labsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;



public class UsingLink_ActivitySecond {

    final static String tekschoolUrl ="https://retail.tekschool-students.com/selenium/links";
    final static String facebookUrl="https://www.facebook.com/";
    final static String googleUrl ="https://www.google.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get(tekschoolUrl);
        driver.manage().window().maximize();

        String tekschoolTitle = driver.getTitle();

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/', '_blank')");

        String facebookTitle =driver.getTitle();

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open ('https://www.google.com/', '_blank')");
        String googleTitle = driver.getTitle();

        System.out.println(facebookTitle);
        System.out.println(googleTitle);
        System.out.println(tekschoolTitle);

        Thread.sleep(3000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(0));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(3000);

        for (String tab : tabs) {

            driver.switchTo().window(tab);

            Thread.sleep(1000);

            driver.close();

        }


        driver.quit();

    }
}
