package trial_exception;

public class InvalidDiscountRateException extends Exception{
    private final double discountRate;

    InvalidDiscountRateException(double discountRate, String errMsg) {
        super(errMsg);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
}
