package Week1.WeekOneDayFourActivity;

import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourFirstActivity {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);


        driver.close();



    }
}
