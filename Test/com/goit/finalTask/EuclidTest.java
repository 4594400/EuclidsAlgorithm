package com.goit.finalTask;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EuclidTest {
    private Euclid euclid;
    @Before
    public void setUp() throws Exception {
         euclid = new Euclid();
    }

    @Test
    public void testGreatestCommonDivisor() throws Exception {
        for ( int x = -10000; x <= 10000; ++x )
            for ( int y = -10000; y <= 10000; ++y )
            {
                int actual = Math.abs(euclid.greatestCommonDivisor(x, y));
                int expected = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
                assertEquals( expected, actual );
            }
    }

}