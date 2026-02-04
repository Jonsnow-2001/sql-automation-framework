package com.kiran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void sampleTest() {
        int sum = 2 + 3;
        Assert.assertEquals(sum, 5);
    }
}
