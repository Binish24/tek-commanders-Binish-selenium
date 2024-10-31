package Week2.Day1.UsingRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FourthExample {

    public static void main(String[] args) throws InterruptedException {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By shopByCategoriesTitleLocator = By.xpath("home__categories-title");
        List<WebElement> shopByCategoriesTitleElement =driver.findElements(shopByCategoriesTitleLocator);

        int shopByCaregoriessize = shopByCategoriesTitleElement.size();
        System.out.println(shopByCaregoriessize);

        for (WebElement element:shopByCategoriesTitleElement){
            String text = driver.getTitle();
            System.out.println(text);
        }

        Thread.sleep(3000);
        driver.quit();


    }


}
