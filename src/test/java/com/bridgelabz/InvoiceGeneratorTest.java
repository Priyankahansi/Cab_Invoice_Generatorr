package com.bridgelabz;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class InvoiceGeneratorTest {

    @org.junit.Test
    @Test
    public void givenDistanceAndTimeShouldReturnFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
}