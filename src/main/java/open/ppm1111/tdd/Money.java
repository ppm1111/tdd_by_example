package open.ppm1111.tdd;

class Money {
    protected int amount;
    protected String currency;
    
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount 
                && currency().equals(money.currency());
    }
    
    String currency() {
        return currency;
    }
    
    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    
    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }
    
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    
    public String toString() {
        return amount + " " + currency;
    }
}
