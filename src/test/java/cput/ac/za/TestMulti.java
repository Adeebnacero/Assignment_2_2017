package cput.ac.za;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/19.
 */
public class TestMulti {

    @Test
    public void multiTest(){

       Multi m1 = new Multi();

        Assert.assertTrue(m1.calculate());
    }
}
