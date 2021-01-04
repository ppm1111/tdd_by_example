package open.ppm1111.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddExampleApplicationTests {
    
    @Test
    public void testMultiple() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testEquals() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    
    @Test
    public void testDifferentClassEquals() {
        assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
    }
    
    @Test
    public void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.franc(10));
        assertEquals(Money.dollar(10), sum);
    }

}
