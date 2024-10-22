import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFirst {

    public static void main (String [] args){


//       /// ChromeDriver driver = new ChromeDriver();
//
//        driver.get("https://www.foxnews.com/");
//
//        driver.manage().window().maximize();
//
//        String pageTitle = driver.getTitle();
//       // String pageTitle = driver.getTitle();
//
//        System.out.println(pageTitle);
//
//        driver.close();
//
//        //driver.quit();


//ChromeDriver chrome = new ChromeDriver();
//
//chrome.get("https://www.cnn.com/");
//
//chrome.manage().window().maximize();
//
//String pageTitle = chrome.getTitle();
//
//        System.out.println(pageTitle);
//
//        chrome.close();
//
//       // chrome.quit();

        ChromeDriver chrome = new ChromeDriver();

        chrome.get("https://naraiman.com/");

        chrome.manage().window().maximize();

        String pageTitle=chrome.getTitle(); /// Get Application Naraiman web title

        System.out.println(pageTitle);

        chrome.close();
    }




}
