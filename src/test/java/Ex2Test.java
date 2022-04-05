import beginners.ex2;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Ex2Test {
    double x = 2;
    double y = 3;
    double k;
    double l;
    double m;
    double a = k;
    double b = l;
    double c = m;
    double d = y - x;

    @Test(enabled = false )
    void ex_21() {
        double expected = ex2.ex_21(x);
        Assert.assertEquals(expected, 25);
    }
    @Test
    void ex_22() {
        double expected = ex2.ex_22(x, y, a, b, c);
        Assert.assertEquals(expected, 53.199999999999996);
    }
}