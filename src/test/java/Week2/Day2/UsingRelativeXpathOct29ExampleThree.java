package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingRelativeXpathOct29ExampleThree {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        Thread.sleep(3000);

        By searchBarLocator = By.xpath("//div[@class='flex rounded']");
        WebElement searchBarElement = driver.findElement(searchBarLocator);
        searchBarElement.sendKeys("Keyboard");

        Thread.sleep(3000);

      By keyBoardFirstItemLocator =  By.xpath("//div[@class ='products']/div[1]/img");
      WebElement keyBoardFirstItemElement = driver.findElement(keyBoardFirstItemLocator);
      searchBarElement.click();

      Thread.sleep(3000);

      By selectItemLocator =By.xpath("//select[@class = 'product__select']");
      WebElement selectItemElement = driver.findElement(selectItemLocator);
      selectItemElement.sendKeys("1");

      By addToCartButtonLocator =By.xpath("//button[@class ='product__btn']");
      WebElement addToCartButtonElement = driver.findElement(addToCartButtonLocator);
      addToCartButtonElement.click();


      if (addToCartButtonElement.equals("1")) {
          System.out.println("The firstItem is added");
      } else {
          System.out.println("The item is not added to the Cart!");
      }

      Thread.sleep(3000);
      driver.quit();


    }
}
