package home.factory;

import org.apache.commons.lang3.time.StopWatch;
import java.security.InvalidParameterException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;


public class MathTests {
    private StopWatch timer = new StopWatch(); //just for fun

    @DataProvider
    public Object[][] getDoubleData() {
        return new Double[][]{
            {10.0, 0.1},
            {-100.0, -0.01},
            {-1.0/3, -3.0},
            {Double.MAX_VALUE, 0d},
            {-Double.MAX_VALUE, 0d},
            {Double.MIN_VALUE, Double.POSITIVE_INFINITY}
        };
    }

    @DataProvider
    public Object[][] getIntData() {
        return new Object[][]{
                {10, 0.1},
                {-1, -1.0},
                {100000, 1e-5}
        };
    }

    @BeforeClass
    public void startFunnyString()  {
        timer.start();
        System.out.println("Tests started..");
    }

    @Test(dataProvider="getDoubleData")
    public void hyperboleWideDoubleTest(double x, double y) {
        Assert.assertEquals(MathFunctions.Hyperbole(x), y, 1e-300);
    }

    @Test(dataProvider="getIntData")
    public void hyperboleWideIntTest(int x, double y) {
        Assert.assertEquals(MathFunctions.Hyperbole(x), y, 1e-300);
    }

    //function must return exception on 0. Expected verification of input in upper-level code
    @Test(expectedExceptions = InvalidParameterException.class)
    public void TestForInvalidInputParameter() {
        Assert.assertEquals(MathFunctions.Hyperbole(0), 1000);
    }

    @Test(enabled = false)
    public void excludedForAWhile01() {
        Assert.assertEquals(MathFunctions.Hyperbole(1), 1);
    }

    @Test
    public void excludedForAWhile02() {
        if (true) throw new SkipException("Skipping the test case");  //To show the ignored test in report

        Assert.assertEquals(MathFunctions.Hyperbole(1), 1);
    }

    @AfterClass
    public void endFunnyString() {
        timer.stop();
        System.out.println("Tests finished with time " + timer.getTime() + " ms");
    }

}
