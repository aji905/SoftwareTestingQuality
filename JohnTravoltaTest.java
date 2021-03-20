import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JohnTravoltaTest {
    private JohnTravolta john = new JohnTravolta();

    @Test
    public void hitungGajiTest(){
        int gaji = john.hitungGaji(40, 0);
        assertEquals(600000, gaji);
    }
}
