package com.goit.finalTask;

import com.goit.finalTask.myExceptions.ExceedingTheNumberOfAllowedAttemptsToEnterException;
import org.junit.Before;
import org.junit.Test;


import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ScannerUtilsTest {
    ScannerUtils scannerUtils;


    @Before
    public void setUp() throws Exception {
        scannerUtils = new ScannerUtils();

    }

    @Test
    public void testReadOnlyIntegersInputIntegerInStringFormat() throws Exception {
        String input = "600";
        Scanner in = new Scanner(input);
        int actual = scannerUtils.readOnlyIntegers(in);
        assertEquals(Integer.parseInt(input), actual);
    }

    @Test (expected = NoSuchElementException.class)
    public void testReadOnlyIntegersInputStringFormat() throws Exception {
        String input = "text";
        Scanner in = new Scanner(input);
        scannerUtils.readOnlyIntegers(in);
    }

    @Test (expected = ExceedingTheNumberOfAllowedAttemptsToEnterException.class)
    public void testReadOnlyIntegersExceedingTheNumberOfAllowedAttemptsToEnterException() throws Exception{
        Scanner in;
        String input = "text";
        for (int i = 0; i < 4; i++){
            input = input + i;
            in = new Scanner(input);
            scannerUtils.readOnlyIntegers(in);
        }

    }

}