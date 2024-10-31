package Week2.Day1.UsingRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FifthExample {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By textTitleLocator = By.xpath("home__categories-title");
        WebElement textTitleElement = driver.findElement(textTitleLocator);
        String textTitle = driver.getTitle();
        System.out.println(textTitle);

        Thread.sleep(2000);

      By shopItemsLocator =  By.xpath("//div2[@class ='home__category'");
      WebElement shopItemElment = driver.findElement(shopItemsLocator);
      shopItemElment.click();

      Thread.sleep(2000);

      driver.quit();



    }

}
