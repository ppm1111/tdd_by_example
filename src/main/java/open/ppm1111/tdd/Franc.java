package open.ppm1111.tdd;

public class Franc extends Money {
    
    Franc(int amount) {
        this.amount = amount;
    }
    
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    
}
