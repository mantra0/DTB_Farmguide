package main.java.com.dtb.run;

import com.dtb.config.dtbConfig;
import main.java.com.dtb.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginFunctionality {

    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.chrome.driver", dtbConfig.chromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void login(){
        driver.get("http://dbt.farmguide.in/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.requestOTP));
        driver.findElement(HomePage.userName).sendKeys("9999999992");
        driver.findElement(HomePage.userPassword).sendKeys("12345678");
        driver.findElement(HomePage.requestOTP).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(HomePage.loginButton, "Login"));
        driver.findElement(HomePage.loginButton).click();
    }
}
