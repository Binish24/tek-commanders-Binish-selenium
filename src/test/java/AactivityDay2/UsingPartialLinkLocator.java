package AactivityDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPartialLinkLocator {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By searchToolbarLocator = By.name("q");
        WebElement searchToolbarElement = driver.findElement(searchToolbarLocator);
        searchToolbarElement.sendKeys("TekSchool");

        Thread.sleep(3000);

       By searchButtonLocator = By.name("btnK");
        WebElement searchButtonElement = driver.findElement(searchButtonLocator);
       searchButtonElement.click();

       Thread.sleep(3000);

       By partialLinkTextLocator = By.partialLinkText(" Training Bootcamp");
       WebElement partialTextElement = driver.findElement(partialLinkTextLocator);
       partialTextElement.click();

       Thread.sleep(3000);
       driver.quit();



    }
}
