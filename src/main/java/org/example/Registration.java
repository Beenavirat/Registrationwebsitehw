package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

    static protected WebDriver driver;

    @Test
    public void UserShoudAbleToRegisterSuccessfully() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
        driver = new ChromeDriver();   //create object
        driver.manage().window().fullscreen();//fullscreen window
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicity wait
        driver.get("https://www.asda.com/");//open url"asda.com"
        driver.findElement(By.xpath("//a[contains(text(),'Groceries')]")).click();//clk on groceries
        driver.findElement(By.xpath("//a[contains(text(),\"Register\")]")).click();//clk on Register
        driver.findElement(By.xpath("//input [@type=\"email\"]")).sendKeys("testtest@test.com");//enter email
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345678");// Enter password
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("123456");//Enter postcode

       driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[1]/span")).click();// Tick terms &conditionc
            driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[2]/span")).click();//Tick offers
       driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button")).click();//clk register

    }

    @Test
    public void UserShouldBeAbleToRegisterSuccessfullySnapfish() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("https://www.snapfish.co.uk/home");   //open url www.snapfish.co.uk
        driver.findElement(By.xpath("//*[@id=\"gdpr-cookie-accept-close\"]")).click();//Accept cookies
        driver.findElement(By.xpath("//*[@id=\"globalHeaderSignInRegister\"]")).click();//joinup/sign up
driver.findElement(By.xpath("//*[@id=\"containerDiv\"]/div[3]/fieldset/div/div[2]/a")).click();
      driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Mohan"); //Enter FirstName
     driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Kumar"); //Enter LastName
        driver.findElement(By.xpath("//input[@id=\"EmailAddress\"]")).sendKeys("testtest@test.com"); //Enter Emailaddress

      driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("abc123"); //Enter Password

    driver.findElement(By.xpath("//*[@id=\"email-subscription-message\"]")).click();//  Tick subscription message
       driver.findElement(By.xpath("//*[@id=\"TNCFlag\"]")).click();//Tick terms and conditions
       driver.findElement(By.xpath("//a[@id=\"signup_submit\"]")).click();// Clk submit

    }
//@Test
//   public void UserShouldBeAbleToRegisterSuccessfullyBoots(){
//    System.setProperty("webdriver.chrome.driver","src/test/java/BrowserDrivers/chromedriver.exe");
//   driver = new ChromeDriver();
//   driver.manage().window().fullscreen();
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    driver.get("https://www.boots.com/");
//   driver.findElement(By.xpath("//*[@id=\"signInQuickLink\"]/span")).click();
//   driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
//   driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-38386608118341500\"]")).click();
//driver.findElement(By.xpath("//input[@id=\"gigya-textbox-130487327125939400\"]")).sendKeys("ABCD");
//driver.findElement(By.xpath("//input[@id=\"gigya-textbox-9480956395172724\"] ")).sendKeys("XYZZ");
//driver.findElement(By.xpath("//*[@id=\"master-registration-login\"]/div[8]/form/div[1]/div[5]/input")).sendKeys("Testtest@test.com");
//driver.findElement(By.xpath("//*[@id=\"gigya-loginID-84608206590771100\"]")).sendKeys("ABCD@gmail.com");
//}



@Test
public void UserShouldBeAbleToRegisterSuccessfullyOcado() {
    System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.ocado.com/");  //open url www.ocado.com
      driver.findElement(By.xpath("   //a[@id=\"quickReg\"]")).click(); //clk on Register
      driver.findElement(By.xpath(" //*[@name=\"title\"] ")).sendKeys("Mrs"); //Title
      driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Thomas");//Enter First Name
     driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Tarzan");//Enter lastname
     driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("TestTest@Test.com");//Enter Email
driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ABCD1234");// Enter Password

driver.findElement(By.xpath("//input[@id=\"postcode\"]")).sendKeys("AB12CD");//Enter Postcode
driver.findElement(By.xpath(" //*[@id=\"registration-submit-button\"]")).click();//Clk on Register

}

@Test
public void UserShouldBeAbleToRegisterSuccessfullyVirginMedia() {
    System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe ");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.virginmedia.com/");   //open url Virginmedia.co.uk
    driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();// for cookies x path
    driver.findElement(By.xpath("//*[@id=\"unified-header\"]/div/div/div[2]/div[2]/div/ul/li[1]/a[1]/span[1]")).click();//clk MY ACCOUNT
    driver.findElement(By.xpath("//*[@id=\"login-media\"]/div/a[2]")).click();// CLK Register
    driver.findElement(By.id("lastName")).sendKeys("ABCDEF");  //Enter lastname
    driver.findElement(By.xpath("//input[@id=\"accountId\"]")).sendKeys("123456");//Enter Account number
    driver.findElement(By.xpath("//select[@id=\"areaReference\"]")).click(); //select area
}

@Test
    public void UserShouldBeAbleToRegisterSuccessfulllyDebenhams() {

    System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe ");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.debenhams.com/");// Open URL www.debenhams.co.uk

    driver.findElement(By.xpath("//*[@id=\"app-footer\"]/footer/div[2]/div[4]/div/button/div")).click();//  accept cookies
    driver.findElement(By.xpath("//*[@id=\"app-header\"]/header/div[1]/div/ul/li[4]/a/div/span")).click();// clk on create account and signin
    driver.findElement(By.xpath("//*[@id=\"app-main\"]/div/div/div/div/div/div[1]/h1")).click();

    driver.findElement(By.xpath("//*[@id=\"app-main\"]/div/div/div/div/div/div[2]/div[1]/ol/li[1]/a")).click();// sign in click
    driver.findElement(By.xpath("//*[@id=\"field-1\"]")).sendKeys("Testtest@test.com");//enter  Email

    driver.findElement(By.name("logonPassword")).sendKeys("ABC123");// Enter Password
    driver.findElement(By.xpath("//*[@id=\"app-main\"]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/form/fieldset/div[5]/button/div")).click();



}
}