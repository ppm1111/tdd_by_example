package open.ppm1111.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddExampleApplicationTests {
    
    @Test
    public void testMultiple() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
    
    @Test
    public void testEquals() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }

}
