package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityOne {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        SeleniumUtility utility = new SeleniumUtility(wait);



        utility.click(By.linkText("Sign in"));
        utility.sendKey(By.name("email"),"quinn.turner@example.com");
        utility.sendKey(By.name("password"),"password123");
        utility.click(By.linkText("Login"));

    }



}
