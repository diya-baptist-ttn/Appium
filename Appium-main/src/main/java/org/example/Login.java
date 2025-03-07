package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class Login extends  BaseTest {
    public void login() throws MalformedURLException {
        appiumDriver();
        WebElement username = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Username']"));
        username.click();
        username.sendKeys("standard_user");

        WebElement password = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Password']"));
        password.click();
        ;
        password.sendKeys("secret_sauce");

        WebElement loginButton = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
        loginButton.click();
    }
    public String loginassert(){
        WebElement title = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]"));
        String Title=title.getText();
        //System.out.println(Title);
        return Title;

    }
}
