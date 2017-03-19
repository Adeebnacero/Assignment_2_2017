package cput.ac.za;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestClass {

    @Test
    private void additionTest() throws Exception
    {
        Main a1 = new Main();

        int expected = 9;
        int result = a1.Addition(8,1);
        Assert.assertEquals(result,expected);
        System.out.println("Main Test " +"Result: " +result+" Expected: "+expected);
    }

    @Test
    private void intergerTest() throws Exception
    {
        Main a2 = new Main();

        int result = a2.Addition(8,1);
        Assert.assertEquals(result,9);
        System.out.println("Interger Test: " +result+ "Expected result is Integer: " +9);
    }

    @Test
    private void notNullTest() throws Exception
    {
        Main n1 = new Main();

        String result = n1.nullTest("Hello");
        Assert.assertNotNull("Will pass as string is present",result);
        System.out.println("Not Null Test "+" Answer: " + result);
    }

    @Test
    private void nullTest() throws Exception
    {
        Main n2 = new Main();

        String result = n2.nullTest(null);
        String expected = null;
        Assert.assertNull(expected,result);
        System.out.println("Null Test " + " Answer: "+ result);
    }

    @Test
    public void floatTest() throws Exception
    {
        Main f1 = new Main();

        double result = f1.floatingPoint(8.50,9.24);
        Assert.assertEquals (17.74,result,0.01);
        System.out.println("Float Test: "+"Result: "+ result +" Expected: " + 17.74 );
    }

    @Test
    public void equalityTest() throws Exception
    {
        Main e1 = new Main();

        String result1 = e1.value("TestValue");
        String result2 = e1.value("TestValue");

        Assert.assertSame(result1,result2,"TestValue");
        System.out.println("Equality Test "+" Result 1: "+ result1 +" Result 2: " +result2 +" Expected: TestValue");

    }

    @Test
    public void testIsEven() {

        boolean answer = true;
        boolean value;
        double num = 6;

        Main i1 = new Main();
        value = i1.isEven(num);

        Assert.assertEquals(answer,value);
    }

    @Test(timeOut = 1000)
    public void TimeOutTest() throws Exception
    {
        Main m4 = new Main();
        m4.nullTest("");
        Assert.assertNotNull("Value is a null",m4.nullTest(""));
        while(true);
    }

    @Ignore
    private void ignoreTest() throws Exception
    {
        Main a2 = new Main();

        int result = a2.Addition(8,1);
        Assert.assertEquals(result,9);
        System.out.println("Interger Test: " +result+ "Expected result is Integer: " +9);
    }
}
