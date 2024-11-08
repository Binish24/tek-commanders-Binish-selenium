package Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextLocator {

    public static void main (String []  args) throws InterruptedException{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();

        Thread.sleep( 3000);

       By linkTextLocator = By.linkText("Business");
        WebElement linkTextElement = driver.findElement(linkTextLocator);
        linkTextElement.click();

        Thread.sleep(3000);

       By titleTextLocator = By.className("juQBdA");
       WebElement titleTextElement=driver.findElement(titleTextLocator);

        String title= linkTextElement.getText();
        System.out.println(title);


       Thread.sleep(2000);

       driver.quit();





    }
}
