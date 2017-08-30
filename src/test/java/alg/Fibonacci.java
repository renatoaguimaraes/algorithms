package alg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci
{

    @Test
    public void test()
    {
        int result = Fibonacci.calc(5);
        assertEquals(120, result);
    }

    private static int calc(int n)
    {
        return (n < 2) ? n : calc(n - 1) + calc(n - 2);
    }

}
