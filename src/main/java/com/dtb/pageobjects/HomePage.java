package main.java.com.dtb.pageobjects;

import org.openqa.selenium.By;

public class HomePage {

    public static By userName = By.cssSelector("[name = 'username']");
    public static By userPassword = By.cssSelector("[name = 'password']");
    public static By requestOTP = By.xpath("//button[@type='submit']");
    public static By forgotPassword = By.xpath("//*[contains(text(),'Forgot Password')]");
    public static By loginButton = By.xpath("//*[contains(text(),'Login')]");
}
