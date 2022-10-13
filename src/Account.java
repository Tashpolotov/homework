import javax.naming.LimitExceededException;

public class Account {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void Deposit(double som)throws amountException {
        amount += som;
        System.out.println("Вы пополнили счет на: " + (double) getAmount() + " Сом");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(int sum) throws amountException {
        if (sum > amount ) {
            throw new amountException ("Операция недоступна, недостаточно средств на счету: " + getAmount() +
                    " :а также вы можете снять 2000 сом: " +
                    "Вы сняли :" + getAmount() + "Остаток на счете 0.0 :");}
        else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " Сом" + " Остаток на счету: "
                    + amount);
        }
    }
}
