package Week1.ActivityDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewActivityIdLocator {


    public static void main(String[] args) {

//        ChromeDriver chromeDriver = new ChromeDriver();
//
//        chromeDriver.get("https://retail.tekschool-students.com/");
//        chromeDriver.manage().window().maximize();
//
//        System.out.println(chromeDriver.getTitle());
//
//
//       By signIn = By.id("signinLink");
//
//       WebElement sign=chromeDriver.findElement(signIn);
//
//       sign.click();
//
//       By newAccount = By.id("newAccountBtn");
//       WebElement createNewAccount = chromeDriver.findElement(newAccount);
//       createNewAccount.click();
//
//       chromeDriver.quit();


ChromeDriver chromeDriver = new ChromeDriver();
chromeDriver.get("https://retail.tekschool-students.com/");
chromeDriver.manage().window().maximize();

        System.out.println(chromeDriver.getTitle());


      By signIn = By.id("signinLink");
      WebElement signInElement=chromeDriver.findElement(signIn);
      signInElement.click();

   By createAccount = By.id("newAccountBtn");
   WebElement createNewAccount=chromeDriver.findElement(createAccount);
   createNewAccount.click();


   chromeDriver.close();





    }
}
