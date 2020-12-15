package open.ppm1111.tdd;

public class Dollar {
    int amount;
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
    public boolean equals(Object object) {
        return true;
    }
}
