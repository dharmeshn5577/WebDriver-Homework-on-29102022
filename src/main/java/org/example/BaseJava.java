package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;

public class BaseJava {

    protected static WebDriver driver;  // imported selenium web driver interface using Maven dependency to perform automation tasks

    // created main method
    public static void main(String[] args) {

        // set driver path for chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");

        // assign value to driver varible as a chrome driver to perform task in chrome browser
        driver = new ChromeDriver();

        // import SimpleDateFormat package to find timestamp in required format
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
//        System.out.println(timeStamp);

        // use inbuilt manage method to manage something, here we have to manage windows, so I have used inbuilt window method
        // and I want to do maximize the window, so I also used inbuilt maximize method
        driver.manage().window().maximize();

        // used get method with driver to navigate to the website
        driver.get("https://demo.nopcommerce.com/");

        // used driver with findelement method by classname to find that particular location and also used click method to click on it
        driver.findElement(By.className("ico-register")).click();

        // used driver with findelement method by id to find that particular location and also used click method to click on it
        driver.findElement(By.id("gender-male")).click();

        // used driver with findelement method by id to find that particular location and also used sendKeys method to fill that data in it
        driver.findElement(By.id("FirstName")).sendKeys("Ram");
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        // to generate new email address each time, created one by using timestamp variable, which I have created above
        String email = "xyz" + timeStamp + "@gmail.com";
        System.out.println("Email ID: "+email);  // print generated email address
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Company")).sendKeys("Patel Trading Co. Ltd.");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Abc@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc@123");

        // imported select method and created object select and used Birth year locator to select birthday from dropdown list
        Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(5);    // To select day 5 use selectByIndex function

        // imported select method and created object select and used Birth month locator to select birth month from dropdown list
        select = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByVisibleText("May");      // To select month May  use selectByVisibleText function

        // imported select method and created object select and used Birth year locator to select birth year from dropdown list
        select = new Select(driver.findElement(By.name("DateOfBirthYear")));
        select.selectByValue("1985");       // To select year 1985 use selectByValue function

       driver.findElement(By.id("register-button")).click();

       // created string variable and assign value by using driver with findelement method by classname to find that particular location
        // and also used getText method to capture that particular message from instructed location
       String regMessage = driver.findElement(By.className("result")).getText();
        System.out.println(regMessage);     // print out the captured message

        driver.close();       // used inbuilt close method to close the current tab of browser
//      driver.quit();        // used inbuilt quit method to close the browser by closing all open tabs



    }
}
