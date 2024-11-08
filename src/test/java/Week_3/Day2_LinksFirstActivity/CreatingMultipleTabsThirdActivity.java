package Week_3.Day2_LinksFirstActivity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class CreatingMultipleTabsThirdActivity {

    final static String cnnUrl ="https://www.cnn.com/";
    final static String bbcUrl ="https://www.bbc.com/news";
    final static String naraimanUrl="https://naraiman.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get(cnnUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        ((JavascriptExecutor)driver).executeScript("window.open('https://www.bbc.com/news/', '_blank')");

        Thread.sleep(3000);

        ((JavascriptExecutor)driver).executeScript("window.open('https://naraiman.com/', '_blank')");

        Thread.sleep(3000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
      //  Set<String> tabSets = new HashSet<>(driver.getWindowHandles()); /// the insertion is not grantee!
        //because of that I preferred to use ArrayList!

        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(0));

        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(2));

        for (String tab : tabs){
            driver.switchTo().window(tab);
            driver.close();
        }

        driver.quit();
    }
}
