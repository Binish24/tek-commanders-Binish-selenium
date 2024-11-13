package Week_3.Day_3.Day_3_KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class KeyBoardSendKeys {
    public static void main(String[] args) throws InterruptedException {

//        String facebookUrl ="https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement userNameField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@placeholder ='Password']"));
//
//        Thread.sleep(3000);
//
//        Actions action = new Actions(driver);
//
//
//        action.click(userNameField).perform();
//
//        for (char character : "Hello Humans!".toCharArray () ) {
//
//            action.sendKeys(String.valueOf(character)).perform();
//
//            Thread.sleep(2000);
//        }
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();


        ////=========================\\\\====================////\\\\====================\\\////======\\\\


//        WebDriver driver = new EdgeDriver();
//        String facebookUrl = "https://www.facebook.com/";
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement userNameField = driver.findElement(
//                By.xpath("//input[@aria-label ='Email or phone number']"));
//
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@data-testid ='royal_pass']"));
//
//
//        Thread.sleep(2000);
//
//        Actions action = new Actions(driver);
//
//        action.click(userNameField).perform();
//
//        for (char character : "Hello And Good Morning!".toCharArray()){
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(3000);
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ////************************* /////////// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^////////////*************************////

//        String facebookUrl = "https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        WebElement userEmailField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordFiled = driver.findElement(
//                By.xpath("//input[@placeholder ='Password']"));
//
//        Thread.sleep(3000);
//
//        Actions action = new Actions(driver);
//
//        action.click(userEmailField).perform();
//
//        for (char character: "Nabiullah Binish".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//        Thread.sleep(1500);
//
//        driver.close();
//        driver.quit();

        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\

//        String facebooUrl = "https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebooUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//
//        WebElement userEmailFiled = driver.findElement(
//                By.xpath("//input[@class= 'inputtext _55r1 _6luy']"));
//
//        WebElement passwordFiled = driver.findElement(
//                By.xpath("//input[@class = 'inputtext _55r1 _6luy _9npi']"));
//
//
//        Actions action = new Actions(driver);
//
//        Thread.sleep(3000);
//
//        for (char character: " Hey Friends!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1500);
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        /////****************************\\\\\*************************////**********************************\\\

//        String facebookUrl = "https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//
//        Thread.sleep(2000);
//
//        WebElement userEmailField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@placeholder ='Password']"));
//
//        Thread.sleep(2000);
//
//
//        Actions action = new Actions(driver);
//
//        action.click(userEmailField).perform();
//
//        for (char character : "Good day!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(2000);
//        }
//        Thread.sleep(1500);
//
//        driver.close();
//        driver.quit();

        ////^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\\\\


//        String facebookUrl = "https://www.facebook.com/";
//        WebDriver driver = new EdgeDriver();
//        driver.get(facebookUrl);
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement userEmailField = driver.findElement(
//                By.xpath("//input[@placeholder ='Email or phone number']"));
//        WebElement passwordField = driver.findElement(
//                By.xpath("//input[@placeholder='Password']"));
//
//        Thread.sleep(2000);
//
//        Actions action = new Actions(driver);
//
//        action.click(userEmailField).perform();
//
//        for (char character : "Hey buddies!".toCharArray()) {
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1500);
//        }
//
//        Thread.sleep(2000);
//
//        action.click(passwordField).perform();
//
//        for (char character : "United State of America!".toCharArray()){
//            action.sendKeys(String.valueOf(character)).perform();
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();

        ///######################################################/////######################################\\\\\\\\
        String facebookUrl = "https://www.facebook.com/";
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

        for (char character : " Hello Friends!".toCharArray()) {
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(2000);

        action.click(passwordField).perform();

        for (char charater : "Afghanistan!".toCharArray()) {
            action.sendKeys(String.valueOf(charater)).perform();
            Thread.sleep(1000);
        }

        Thread.sleep(2000);

        driver.close();
        driver.quit();











    }
}
