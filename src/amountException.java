public class amountException extends Exception {
    private Double remainingAmount;

    public amountException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
