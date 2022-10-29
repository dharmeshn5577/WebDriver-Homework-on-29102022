package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCategories {

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

        System.out.println("List of Categories on Homepage: ");
        // used driver with findelement method by using xpath to find that particular location
        // and also used getText method to capture that category title from instructed location
        String computers = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]")).getText();
        System.out.println("1. "+computers);      // print out the captured category title
        String electronics = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]")).getText();
        System.out.println("2. "+electronics);
        String apparel = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/apparel\"]")).getText();
        System.out.println("3. "+apparel);
        String digitalDownloads = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/digital-downloads\"]")).getText();
        System.out.println("4. "+digitalDownloads);
        String books = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/books\"]")).getText();
        System.out.println("5. "+books);
        String jewelry = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/jewelry\"]")).getText();
        System.out.println("6. "+jewelry);
        String giftCards = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/gift-cards\"]")).getText();
        System.out.println("7. "+giftCards);

        driver.quit();      // used inbuilt quit method to close the browser by closing all open tabs
    }
}
