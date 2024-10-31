package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingRelativeXpathOct29 {
    public static void main(String[] args) throws InterruptedException {


//        EdgeDriver driver = new EdgeDriver();
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//       driver.findElement( By.xpath("//input[@type ='text']")).sendKeys("Apple");
//
//       String text = driver.getTitle();
//        System.out.println(text);
//
//        Thread.sleep(3000);
//        driver.quit();



        //*******************        *******************       ********************       *********************
        //Parent and Child level xpath!!


//        EdgeDriver driver = new EdgeDriver();
//        driver.get("https://retail.tekschool-students.com");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        driver.findElement( By.xpath("//div[@class='products']/div[1]/img")).click();
//
//        Thread.sleep(3000);
//
//        driver.quit();

        //*********************      ***********************     *********************     *******************\
//
//        EdgeDriver driver = new EdgeDriver();
//        driver.get("https://retail.tekschool-students.com/auth/login");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//        By createNewAccountLocator = By.xpath("//a[contains(text(), 'New Account')]");
//        WebElement createNewAccountElement = driver.findElement(createNewAccountLocator);
//        createNewAccountElement.click();
//
//        Thread.sleep(3000);
//
//        driver.quit();

       ///////****************************************************

//        EdgeDriver driver = new EdgeDriver(); ////
//        driver.get("https://retail.tekschool-students.com/auth/login");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);

//        By signInButtonLocator = By.xpath("//a[contains(text(), 'Sign in')]");
//        WebElement signInButtonElement = driver.findElement(signInButtonLocator);
//        signInButtonElement.click();
//
//       By orButtonLocator = By.xpath("div[@class ='login__layout']/[text()='Or']");
//       WebElement orElement = driver.findElement(orButtonLocator);
//       orElement.click();
//
//       Thread.sleep(1000);
//
//       driver.manage();\

        //       *************************************           *************************//

//        ChromeDriver driver = new ChromeDriver(); ////
//        driver.get("https://retail.tekschool-students.com/auth/login");
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//
//       By signInButtonLocator = By.xpath("//a[contains(text(), 'Sign in')]");
//       WebElement signInButtonElement = driver.findElement(signInButtonLocator);
//       signInButtonElement.click();
//
//      By signInTitleLocator =  By.xpath("h1[contains(text(), 'Sign in')]");
//      WebElement signInElement = driver.findElement(signInTitleLocator);
//
//      String textTitle = driver.getTitle();
//        System.out.println(textTitle);
//
//        Thread.sleep(1000);
//        driver.quit();


//        ************************         *************************         ****************************

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       By infoTextLocator = By.xpath("div[contains(text(), 'Purposes')]");
       WebElement infoTextElement = driver.findElement(infoTextLocator);

       String infoText = driver.getTitle();
        System.out.println(infoText);

        Thread.sleep(1000);

        driver.quit();




    }
}
