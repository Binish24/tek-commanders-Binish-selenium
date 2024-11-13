package Week_3.Day_3.Day_3_KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSendKeysUsingUpperCaseCharacters {
    public static void main(String[] args) throws InterruptedException {

        String facebookUrl ="https://www.facebook.com/";
        WebDriver driver = new EdgeDriver();
        driver.get(facebookUrl);
        driver.manage().window().maximize();

        WebElement userEmailField = driver.findElement(
                By.xpath("//input[@placeholder ='Email or phone number']"));

        WebElement passwordField = driver.findElement(
                By.xpath("//input[@placeholder='Password']"));

        Thread.sleep(2000);


        Actions action = new Actions(driver);

        action.click(userEmailField).perform();

       // action.keyDown(Keys.SHIFT).perform();
        action.keyDown(Keys.SHIFT).perform();

        for (char character : " Hello Friends!".toCharArray()) {
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(2000);

        action.keyDown(Keys.TAB).perform();

        Thread.sleep(5000);



//        action.click(passwordField).perform();
//
//        for (char charater : "Afghanistan!".toCharArray()) {
//            action.sendKeys(String.valueOf(charater)).perform();
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(2000);

        driver.close();
        driver.quit();


    }
}
