package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend {

    // // imported selenium web driver interface using Maven dependency to perform automation tasks
    protected static WebDriver driver;

    // created main method
    public static void main(String[] args) {

        // set driver path for chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");

        // assign value to driver varible as a chrome driver to perform task in chrome browser
        driver = new ChromeDriver();

        // use inbuilt manage method to manage something, here we have to manage windows, so I have used inbuilt window method
        // and I want to do maximize the window, so I also used inbuilt maximize method
        driver.manage().window().maximize();

        // used get method with driver to navigate to the website
        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.xpath("//div[@data-productid=\"4\"]/div[2]/h2/a[1]")).click();
        driver.findElement(By.xpath(" //div[@class=\"email-a-friend\"]/button")).click();
        driver.findElement(By.id("FriendEmail")).sendKeys("friend123@gmail.com");
        driver.findElement(By.id("YourEmailAddress")).sendKeys("ram999@gmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("This is a very nice deal with great price.");
        driver.findElement(By.name("send-email")).click();
        String errorMessage = driver.findElement(By.xpath("//form[@method=\"post\"]/div[1]/ul/li")).getText();
        System.out.println(errorMessage);

        driver.quit();      // used inbuilt quit method to close the browser by closing all open tabs
    }

}
