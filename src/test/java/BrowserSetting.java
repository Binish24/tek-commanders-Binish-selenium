import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetting {

 public static void main (String [] args) {

     //ChromeDriver chromeDriver = new ChromeDriver();

   //  chromeDriver.get("https://www.google.com/");

     //chromeDriver.manage().window().maximize();

    // chromeDriver.get("https://naraiman.com/");
    // chromeDriver.manage().window().maximize();

    // String pageTitle = chromeDriver.getTitle();
     //System.out.println(pageTitle);

     //chromeDriver.quit();

     //chromeDriver.close();

     ChromeDriver chrome = new ChromeDriver();

     chrome.get("https://naraiman.com/");

     chrome.manage().window().maximize();

     String pageTitle=chrome.getTitle();

     System.out.println(pageTitle);

     chrome.close();





 }



}
