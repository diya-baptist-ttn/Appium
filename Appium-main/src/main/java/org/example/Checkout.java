package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class Checkout extends AddCart {

    public void proceedToCheckout() throws MalformedURLException {
        appiumDriver();
        login();
        Addcart();

        WebElement cart = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-Cart']"));
        cart.click();
        WebElement checkoutButton = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
        checkoutButton.click();
        WebElement firstName = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-First Name']"));
        firstName.sendKeys("Diya");
        WebElement lastName = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Last Name']"));
        lastName.sendKeys("Baptist");
        WebElement postalCode = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']"));
        postalCode.sendKeys("201031");
        WebElement continueButton = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUE']"));
        continueButton.click();

        androidDriver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"
        ));
        WebElement finishButton = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-FINISH']"));
        finishButton.click();
    }

    public String checkoutAssert() {
        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(10));
        WebElement thankYouMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"CHECKOUT: COMPLETE!\"]")));
        return thankYouMessage.getText();

    }
}
