public class RewardValue {
    double cashValue;
    int milesValue;
    static final double rate = 0.0035;
    
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

        milesValue = (int)(cashValue / rate);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = milesValue * rate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}