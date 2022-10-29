package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {

    // // imported selenium web driver interface using Maven dependency to perform automation tasks
    protected  static WebDriver driver;

    // created main method
    public static void main(String[] args) {

        // set driver path for chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

        // assign value to driver varible as a chrome driver to perform task in chrome browser
        driver = new ChromeDriver();

        // use inbuilt manage method to manage something, here we have to manage windows, so I have used inbuilt window method
        // and I want to do maximize the window, so I also used inbuilt maximize method
        driver.manage().window().maximize();

        // used get method with driver to navigate to the website
        driver.get("https://demo.nopcommerce.com/");

        // used driver with findelement method by using xpath to find that particular location and also used click method to click on it
        driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]//h2/a[@href=\"/desktops\"]")).click();
        System.out.println("Listed Desktop Products:");
        // used driver with findelement method by using xpath to find that particular location and also used getText method to store the product title from it
        String product1 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]//h2[1]/a[1]")).getText();
        // print out the captured product title
        System.out.println("1. "+product1);
        String product2 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]//h2[1]/a[1]")).getText();
        System.out.println("2. "+product2);
        String product3 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]//h2[1]/a[1]")).getText();
        System.out.println("3. "+product3);

        driver.close();     // used inbuilt close method to close the current tab of browser
    }
}
