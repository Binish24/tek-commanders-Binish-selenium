package Week_3.Day_3.Day_3_KeyBoardActions;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class KeyBoardShortcutAction {
    public static void main(String[] args) throws InterruptedException {

//        String facebookUrl = "https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        WebElement userEmailField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@placeholder='Password']"));
//
//        Thread.sleep(2000);
//
//
//        Actions action = new Actions(driver);
//
//        action.click(userEmailField).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        for (char character : " Hello Friends!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(2000);
//
//        action.click(passwordField).perform();
//
//        for (char charater : "Afghanistan!".toCharArray()) {
//            action.sendKeys(String.valueOf(charater)).perform();
//            Thread.sleep(100);
//        }
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ///======================================\\\\==============================///===========================\\\\
//
//        String facebookUrl ="https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(1000);
//
//
//        WebElement userEmailInputLocator = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordInputLocator = driver.findElement(
//                By.xpath("//input[@placeholder ='Password']"));
//
//        Thread.sleep(15000);
//
//        Actions action = new Actions(driver);
//
//        action.click(userEmailInputLocator).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.SHIFT).perform();
//
//        Thread.sleep(2000);
//
//
//        for (char character : " Hello!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.click(passwordInputLocator).perform();
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//        Thread.sleep(2000);
//
//        for (char character : "Alameda!123!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//
//
//        driver.close();
//        driver.quit();

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\\\\\@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\\\@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

//        String facebook ="https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebook);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement userEmailField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@placeholder ='Password']"));
//
//
//        Thread.sleep(2000);
//
//        Actions action = new Actions(driver);
//
//
//        action.click(userEmailField).perform();
//
//        action.keyDown(Keys.SHIFT).perform();
//
//        for (char character : "Hello!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(2000);
//
//        action.click(passwordField).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        for (char character : "Alameda!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(5000);
//
//        action.keyDown(Keys.TAB).perform();
//
//        Thread.sleep(2000);
//
//        action.keyDown(Keys.ENTER).perform();
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        //###############################\\#############################\\^^^^^^^^^^^^^^^^^^^^^^^^^^\\#############/\\

        String baseUrl = "https://www.facebook.com/";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        Thread.sleep(2000);

        WebElement userEmailField = driver.findElement(
                By.xpath("//input[@aria-label ='Email or phone number']"));

        WebElement passwordField = driver.findElement(
                By.xpath("//input[@aria-label ='Email or phone number']"));


        Actions action = new Actions(driver);


        action.click(userEmailField).perform();

        Thread.sleep(1000);


        for (char character : "Good Morning!".toCharArray()) {

            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(1000);
        }


        Thread.sleep(2000);

        action.click(passwordField).perform();

        Thread.sleep(2000);

        action.keyDown(Keys.TAB).perform();

        Thread.sleep(2000);

        for (char character : "Alameda!".toCharArray()) {

            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(2000);
        }

        Thread.sleep(2000);

        action.keyDown(Keys.TAB).perform();

        Thread.sleep(2000);
        action.keyDown(Keys.ENTER).perform();

        Thread.sleep(4000);

        action.keyDown(Keys.TAB).perform();

        Thread.sleep(2000);

        action.keyDown(Keys.ENTER).perform();

        Thread.sleep(4000);

        action.keyDown(Keys.TAB).perform();

        Thread.sleep(1000);

        action.keyDown(Keys.ENTER).perform();

        Thread.sleep(4000);

//        wait.until(ExpectedConditions.titleIs("Log into Facebook"));
//        String title = driver.getTitle();
//        System.out.println(title);

        Thread.sleep(2000);

        driver.close();
        driver.quit();



    }
}
