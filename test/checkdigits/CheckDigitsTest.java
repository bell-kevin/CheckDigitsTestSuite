package checkdigits;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters; // this line of code is not actually used by the program
import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*; // this line of code is not actually used by the program

@RunWith(Parameterized.class)
public class CheckDigitsTest {
    
    @Parameterized.Parameter(0)
    public double num1;
    @Parameterized.Parameter(1)
    public double num2;
    @Parameterized.Parameter(2)
    public double num3;
    @Parameterized.Parameter(3)
    public double num4;
    @Parameterized.Parameter(4)
    public double largest;
    @Parameterized.Parameter(5)
    public double smallest;
    
    //test data for all methods
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            {1.00, 2.00, 3.00, 4.00, 4.00, 1.00}, //test case 1  
            {1.00, 2.00, 3.00, 4.00, 4.00, 1.00} //test case 2 
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double expResult = num1 + num2 + num3 + num4;
        double result = CheckDigits.getTotal(num1, num2, num3, num4);
        assertEquals(expResult, result, 0.001);
    } //end testGetTotal

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        double expResult = (num1 + num2 + num3 + num4) / 4;
        double result = CheckDigits.getAverage(num1, num2, num3, num4);
        assertEquals(expResult, result, 0.001);
    } //end testGetAverage

    @Test
    public void testGetLargest() {
        System.out.println("getLargest");
        double expResult = largest;
        double result = CheckDigits.getLargest(num1, num2, num3, num4);
        assertEquals(expResult, result, 0.001);
    } //end testGetLargest

    @Test
    public void testGetSmallest() {
        System.out.println("getSmallest");
        double expResult = smallest;
        double result = CheckDigits.getSmallest(num1, num2, num3, num4);
        assertEquals(expResult, result, 0.001);
    } //end testGetSmallest 
} //end class CheckDigitsTest
