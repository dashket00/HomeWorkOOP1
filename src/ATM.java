public class ATM {
    int count20;
    int count50;
    int count100;

    public ATM(int initCount20, int initCount50, int initCount100) {
        this.count20 = initCount20;
        this.count50 = initCount50;
        this.count100 = initCount100;
    }

    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
        System.out.println("Деньги успешно добавлены в банкомат.");
    }

    public boolean withdrawMoney(int summa) {
        int ostatok = summa;

        int num100 = Math.min(ostatok / 100, count100);
        ostatok -= num100 * 100;

        int num50 = Math.min(ostatok / 50, count50);
        ostatok -= num50 * 50;

        int num20 = Math.min(ostatok / 20, count20);
        ostatok -= num20 * 20;

        if (ostatok == 0) {
            count100 -= num100;
            count50 -= num50;
            count20 -= num20;

            System.out.println("Сумма " + summa + " успешно снята.");
            System.out.println("Выдано " + num100 + " купюр по 100, " + num50 + " купюр по 50 и " + num20 + " купюр по 20.");
            return true;
        } else {
            System.out.println("Не удалось выполнить операцию. Недостаточно средств в банкомате.");
            return false;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(10, 10, 10);

        atm.addMoney(5, 5, 5);

        if (atm.withdrawMoney(370)) {
            System.out.println("Операция выполнена успешно.");
        } else {
            System.out.println("Операция не удалась.");
        }
    }
}
