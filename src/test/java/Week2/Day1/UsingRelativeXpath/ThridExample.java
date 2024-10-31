package Week2.Day1.UsingRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ThridExample {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By purchaseCartLocator = By.xpath("//div[@class= 'top-nav__btn']");
        WebElement purchaseCartElement = driver.findElement(purchaseCartLocator);
        purchaseCartElement.click();

        Thread.sleep(3000);

        driver.quit();






    }
}
