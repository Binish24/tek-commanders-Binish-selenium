package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingXpathActivityTwo {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By searchBarLocator = By.xpath("//input[@class ='search__input']");
        WebElement searchElement = driver.findElement(searchBarLocator);
        searchElement.sendKeys("TV");

        Thread.sleep(3000);

        By searchButtonLocator =By.xpath("//button[@class ='search__btn']");
        WebElement searchAElement = driver.findElement(searchBarLocator);
        searchElement.click();

        Thread.sleep(3000);

      By firstItemLocator =  By.xpath("//div[@class ='products']/div[1]/img");
      WebElement firstItemElement = driver.findElement(firstItemLocator);
      firstItemElement.click();

      Thread.sleep(3000);

      By addToCartLocator = By.xpath("/button[@class ='product__btn']");
      WebElement addElement = driver.findElement(addToCartLocator);
      addElement.click();

        if ( addElement.equals("1")) {
            System.out.println("added element equals one!");
        } else {
            System.out.println("no item is added");
        }

        driver.quit();
    }






    }
}
