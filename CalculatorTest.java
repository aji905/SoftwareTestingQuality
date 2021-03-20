import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testDivideBerhasil(){
        int hasil = calculator.divide(100, 10);
        assertEquals(10, hasil);
    }

    @Test
    public void testDivideGagal(){
        assertThrows(IllegalArgumentException.class, () ->{
            calculator.divide(100, 0);
        });
    }

    @Test
    public void testAddberhasil(){
        int hasil = calculator.add(10, 10);
        assertEquals(20, hasil);
    }

}
