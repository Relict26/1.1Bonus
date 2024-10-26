public class Main {
    public static void main(String[] args) {
        int balance = 400; // начальная сумма
        int amount = 1200; // сумма пополнения

        int bonus = 0; // бонус

                if (amount > 1000) {
                        bonus = (amount / 100); // бонусы за каждую полную сотню
        }

        int finalBalance = balance + amount + bonus; // итоговая сумма на счету
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
    }
}
