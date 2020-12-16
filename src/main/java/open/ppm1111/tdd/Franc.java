package open.ppm1111.tdd;

public class Franc extends Money {
    
    Franc(int amount) {
        this.amount = amount;
    }
    
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    
}
