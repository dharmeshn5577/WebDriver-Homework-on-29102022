package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {

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

        // used driver with findelement method by using xpath to find that particular location and also used click method to click on it
        driver.findElement(By.xpath("//a[contains(@href, \"release\") and contains(@class, \"read\")]")).click();

        // used driver with findelement method by id to find that particular location and also used sendKeys method to fill that data in it
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Product variety collection");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("We have listed so many new products and now you have very large collection of products.");
        driver.findElement(By.name("add-comment")).click();

        // created string variable and assign value by using driver with findelement method by classname to find that particular location
        // and also used getText method to capture that particular message from instructed location
        String regMessage = driver.findElement(By.className("result")).getText();
        System.out.println(regMessage); // print out the captured message

        driver.quit();      // used inbuilt quit method to close the browser by closing all open tabs
//      driver.close();     // used inbuilt close method to close the current tab of browser
    }
}
