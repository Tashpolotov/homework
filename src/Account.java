import javax.naming.LimitExceededException;

public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;

    }

    public void deposid(Double som) throws amountException {
        amount += som;
        System.out.println("Вы пополнили счет на: " + (double) getAmount() + " Сом");
    }

    public void withDraw(Double som) throws amountException {
        if (som > amount) {
            throw new amountException("Операция не доступна: ", amount);
        } else {
            amount -= som;
            System.out.println("Вы сняли со счета: "  + "som: " +
                    "ostatok na s4etu: " + amount);
        }

    }
}


