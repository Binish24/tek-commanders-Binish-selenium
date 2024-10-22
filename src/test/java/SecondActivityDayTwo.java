public class SecondActivityDayTwo {

    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        chromeDriver.manage().window().maximize();


        By email = By.name("email");
        WebElement emailElement = chromeDriver.findElement(email);

        emailElement.sendKeys("benish@ygmail.com");

        By password = By.name("password");
        WebElement passwordElement = chromeDriverd.findElement(password);
        passwordElement.sendKeys("Pass1212@@");


        Thread.sleep(1000);

        chromeDriver.close();


    }
}
