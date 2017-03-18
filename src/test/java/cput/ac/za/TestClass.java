package cput.ac.za;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestClass {

    @Test
    private void additionTest()
    {
        Addition a1 = new Addition();

        int expected = 9;
        int result = a1.Addition(5,4);
        Assert.assertEquals(result,expected);
        System.out.println("Addition Test " +"Result: " +result+" Expected: "+expected);
    }

    @Test
    private void notNullTest()
    {
        Nullness n1 = new Nullness();

        String result = n1.nullTest("Hello");
        Assert.assertNotNull("Will pass as string is present",result);
        System.out.println("Not Null Test "+" Answer: " + result);
    }

    @Test
    private void nullTest()
    {
        Nullness n2 = new Nullness();

        String result = n2.nullTest(null);
        String expected = null;
        Assert.assertNull(expected,result);
        System.out.println("Null Test " + " Answer: "+ result);
    }

    @Test
    public void floatTest()
    {
        Float f1 = new Float();

        double result = f1.floatingPoint(5.00,3.20);
        double expected = 8.20;
        Assert.assertEquals (expected,result,0.01);
        System.out.println("Float Test "+" Result: "+ result +" Expected: " +expected);
    }

    @Test
    public void equalityTest()
    {
        Equality e1 = new Equality();

        int result1 = e1.value(5);
        int result2 = e1.value(5);
        Assert.assertSame(result1,result2,"5");
        System.out.println("Equality Test "+" Result 1: "+ result1 +" Result 2: " +result2 +" Expected: 5");

    }
}
