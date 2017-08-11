package com.endava.test;

import com.endava.calculator.BasicCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddIT {
    BasicCalculator basicCalculator;

    @BeforeTest()
    public void testBfAddition() {
        basicCalculator = new BasicCalculator();
    }

    @Test(suiteName = "add suite")
    public void testIntegerAddition() {
        BasicCalculator basicCalculator = new BasicCalculator();

        Assert.assertEquals(basicCalculator.addNumbers(3, 5), new Long(8));
    }

    @Test
    public void testDoubleAddition() {
        BasicCalculator basicCalculator = new BasicCalculator();

        Assert.assertEquals(basicCalculator.addNumbers(4.2, 5.789), new Double(9.989));

    }

    @Test
    public void testLongAddition() {
        BasicCalculator basicCalculator = new BasicCalculator();

        Assert.assertEquals(basicCalculator.addNumbers(333333, 666666), new Long(999999));

    }

    //AssertJ tests
    @Test
    public void testIntAdd_1() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(15, 20)).isEqualTo(35);
    }

    @Test
    public void testIntAdd_2() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(10, 25)).isGreaterThanOrEqualTo(35);
    }

    @Test
    public void testIntAdd_3() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(5, 10)).isNotNegative();
    }

    @Test
    public void testIntAdd_4() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(-5, -10)).isNegative();
    }

    @Test
    public void testIntAdd_5() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(10, -10)).isZero();
    }

    @Test
    public void testLongAdd_6() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(1500000000, 250000000)).isGreaterThanOrEqualTo(400000000);
    }

    @Test
    public void testLongAdd_7() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(-999999999, -999999999)).isLessThan(-999999999);
    }

    @Test
    public void testDoubleAdd_8() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(5.99, 4.99)).isGreaterThanOrEqualTo(10);
    }

    @Test
    public void testLongAdd_9() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(-999999999.9, -9999999999999.9)).isLessThan(-999999999);
    }

    @Test
    public void testLongAdd_10() {
        BasicCalculator basicCalculator = new BasicCalculator();
        assertThat(basicCalculator.addNumbers(-999999999.9, 999999999.9)).isZero();
    }
}
