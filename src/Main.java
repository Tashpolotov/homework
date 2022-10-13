import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposid(20000.0);
        } catch (amountException a) {
            a.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Napiwite summu vyvoda: ");
                account.withDraw(scanner.nextDouble());

                System.out.println("Вы сняли со счета: "  + scanner.nextDouble() + "som: " +
                        "ostatok na s4etu: " + account.getAmount());
            } catch (amountException amountException) {
                System.out.println(amountException.getMessage());
                try {
                    account.withDraw( amountException.getRemainingAmount());
                } catch (amountException b) {
                    b.printStackTrace();
                }
                break;

            }
        }

    }
}