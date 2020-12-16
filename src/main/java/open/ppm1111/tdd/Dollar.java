package open.ppm1111.tdd;

public class Dollar extends Money {
    
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
