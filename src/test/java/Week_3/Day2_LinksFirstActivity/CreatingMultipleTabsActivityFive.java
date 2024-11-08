package Week_3.Day2_LinksFirstActivity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CreatingMultipleTabsActivityFive {

    final static String googleUrl = "https://www.google.com/";
    final static String facebookUrl = "https://www.facebook.com/";
    final static String naraimanUrl ="https://naraiman.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get(googleUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open ('https://www.facebook.com/', '_blank')");

        String facebookTitle = driver.getTitle();

        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.open ('https://naraiman.com/', '_blank')");

        String naraimanTitle = driver.getTitle();

        System.out.println(facebookTitle);
        System.out.println(naraimanTitle);


        Thread.sleep(3000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
       // Set<String> tabsTwo = new LinkedHashSet<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(3000);

        for (String tab : tabs) {

            driver.switchTo().window(tab);
            driver.close();
        }

        Thread.sleep(1500);


        driver.quit();

    }

}
