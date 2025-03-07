package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends Login {


    @Test
    public void loginTest() throws MalformedURLException {
        login();
        //loginassert();

        Assert.assertEquals(loginassert(), "PRODUCTS", "Login failed: Title mismatch!");;



    }

}
