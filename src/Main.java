

public class Main {
    public static void main(String[] args) throws amountException {
        Account account = new Account();
        account.Deposit(20000.0);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (amountException amountException) {
                System.out.println(amountException.getMessage());
                    break;
            }
                 }

            }
        }
