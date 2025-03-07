package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

public class AddCartTest extends AddCart {
    @Test
    public void AddCart() throws MalformedURLException {
        login();
        Addcart();
        Assert.assertEquals(addcartassert(), "1", "Add Cart failed");;


    }

}
