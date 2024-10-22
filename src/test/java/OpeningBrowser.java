import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpeningBrowser {

    public static void main(String[] args) {


       // ChromeDriver chromeDriver = new ChromeDriver();

       // chromeDriver.get("https://www.facebook.com/");


       // ChromeDriver driver = new ChromeDriver();

       //driver.get("https://naraiman.com/");


      //  SafariDriver safariDriver = new SafariDriver();

       // safariDriver.get("https://www.selenium.dev");

        //ChromeDriver chrome = new ChromeDriver();

      //  chrome.get("https://naraiman.com/");

       // chrome.close();

       // chrome.quit(); ///quit means, Once we clicked this one, this will close all the Tabs!!!!

        ChromeDriver chromeDriver = new ChromeDriver();
         chromeDriver.get("https://www.facebook.com/");

         chromeDriver.close();
        // chromeDriver.quit();






    }



}
