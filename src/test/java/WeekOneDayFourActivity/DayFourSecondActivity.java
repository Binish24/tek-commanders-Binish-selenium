package WeekOneDayFourActivity;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class DayFourSecondActivity {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.quit();



        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        edgeDriver.manage().window().maximize();

        String Title = driver.getTitle();
        System.out.println(Title);

        edgeDriver.quit();

        Scanner input = new Scanner(System.in);
        System.out.println("print one of the browsers; Chrome or Edge?");
        String user = input.next();

        if (user.equals("Chrome")){
            driver= new ChromeDriver();
        }else
            edgeDriver= new EdgeDriver();



    }
}
