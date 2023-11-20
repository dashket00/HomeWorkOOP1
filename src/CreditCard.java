public class CreditCard {
    String accountNumber;
    int balance;

    public CreditCard(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void popolneniye(int summa) {
        if (summa > 0) {
            balance += summa;
            System.out.println("Депозит на сумму " + summa + " успешно выполнен.");
        } else {
            System.out.println("Неверная сумма для депозита.");
        }
    }

    public void snyatie(int summa) {
        if (summa > 0 && summa <= balance) {
            balance -= summa;
            System.out.println("Снятие на сумму " + summa + " успешно выполнено.");
        } else {
            System.out.println("Неверная сумма для снятия или недостаточно средств.");
        }
    }

    public void displayCardInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + balance);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234567890123456", 1000);
        CreditCard card2 = new CreditCard("9876543210987654", 500);
        CreditCard card3 = new CreditCard("1111222233334444", 700);

        card1.popolneniye(200);
        card2.popolneniye(300);
        card3.snyatie(100);

        System.out.println("Состояние первой карточки:");
        card1.displayCardInfo();
        System.out.println();
        System.out.println("Состояние второй карточки:");
        card2.displayCardInfo();
        System.out.println();
        System.out.println("Состояние третьей карточки:");
        card3.displayCardInfo();
    }
}
