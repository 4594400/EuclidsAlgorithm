package com.goit.finalTask;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class EuclidTest {

    private Euclid euclid;

    @Before
    public void setUp() throws Exception {
        euclid = new Euclid();
    }

    @Test
    public void testGreatestCommonDivisorOne() throws Exception {
        int x = 0;
        int y = 34343;

        int actual = Math.abs(euclid.greatestCommonDivisor(x, y));
        int expected = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
        assertEquals(expected, actual);
    }

    @Test(timeout = 6000)
    public void testGreatestCommonDivisorLoop() throws Exception {
        for (int x = -2000; x <= 2000; ++x)
            for (int y = -2000; y <= 2000; ++y) {
                int actual = Math.abs(euclid.greatestCommonDivisor(x, y));
                int expected = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
                assertEquals(expected, actual);
            }
    }

}