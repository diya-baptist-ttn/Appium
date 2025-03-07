package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver androidDriver;


    public void appiumDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        //options.setPlatformVersion("13");
        options.setDeviceName("OnePlus CE 3 Lite 5G");
        options.setAutomationName("UiAutomator2");

        //options.setCapability("fullReset", true);
        //options.setApp("C:\\Users\\Diya Baptist\\IdeaProjects\\IntroductionToMobileAutomation\\src\\main\\resources\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");
        options.setAppWaitDuration(Duration.ofSeconds(20));
        options.setNewCommandTimeout(Duration.ofMinutes(30));
        options.setCapability("autoGrantPermission", true);
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
