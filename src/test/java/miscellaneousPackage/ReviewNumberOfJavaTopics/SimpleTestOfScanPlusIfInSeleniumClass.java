package miscellaneousPackage.ReviewNumberOfJavaTopics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class SimpleTestOfScanPlusIfInSeleniumClass {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String textTitle = driver.getTitle();
        System.out.println(textTitle);

        Thread.sleep(3000);

        Scanner input = new Scanner(System.in);
        System.out.println("print of the browsers; Chrome or Edge?");
        String user = input.next();

        if (user.equals("Chrome")) {
          driver = new EdgeDriver();
        } else
            driver = new EdgeDriver();

    }



}
