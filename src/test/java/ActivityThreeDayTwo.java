import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityThreeDayTwo {


    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(1000);

       By subTitleLocator = By.className("login__subtitle");
        WebElement



    }
}
