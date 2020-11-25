public class Main {
    public static void main(String[] args) {
        long balance = 100;
        int everyRuble = 100;
        long payment = 1100;
        long bonus = 0;

        if (payment >= 1000) {
            bonus = payment / everyRuble;
            balance = balance + payment + bonus;
        } else {
            balance = balance + payment;
        }
        System.out.println("Бонус составил: " + bonus + " рублей");
        System.out.println("Текущий баланс: " + balance + " рублей");
    }
}
