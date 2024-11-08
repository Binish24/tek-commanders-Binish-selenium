package Week_3.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;

public class day3_SecondActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String baseUrl ="https://www.facebook.com/";
        driver.get(baseUrl);

        driver.manage().window().maximize();


        WebElement userEmailInput = driver.findElement(
                By.xpath("//input[@placeholder ='Email or phone number']"));

        WebElement userPasswordInput = driver.findElement(
                By.xpath("//input[@placeholder ='Password']"));


        Thread.sleep(3000);




    }
}
