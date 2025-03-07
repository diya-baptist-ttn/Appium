package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutTest {
    private Checkout checkout;

    @BeforeTest
    public void setup() {
        checkout = new Checkout();
    }

    @Test
    public void testCheckout() throws Exception {
        checkout.proceedToCheckout();

        Assert.assertEquals(checkout.checkoutAssert(), "CHECKOUT: COMPLETE!", "Checkout failed!");
    }
}
