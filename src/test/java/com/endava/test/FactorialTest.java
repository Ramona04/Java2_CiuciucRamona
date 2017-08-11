package com.endava.test;

import com.endava.calculator.ExpertCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;


public class FactorialTest {

    @Test
    public void testFactorial() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        Assert.assertEquals(expertCalculator.factorial(4), new Integer(24));
    }

    //Hamcrest tests
    @Test
    public void testFactorial_1() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        assertThat(expertCalculator.factorial(5), is(equalTo(120)));
    }

    @Test
    public void testFactorial_2() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        assertThat(expertCalculator.factorial(5), isA(Integer.class));
    }

    @Test
    public void testFactorial_3() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        assertThat(expertCalculator.factorial(5), is(greaterThanOrEqualTo(120)));
    }

    @Test
    public void testFactorial_4() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        assertThat(expertCalculator.factorial(5), is(greaterThan(119)));
    }

    @Test
    public void testFactorial_5() {
        ExpertCalculator expertCalculator = new ExpertCalculator();
        assertThat(expertCalculator.factorial(5), is(lessThan(121)));
    }
}
