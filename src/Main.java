public class Main {
    public static void main(String[] args) {
        int init_sum = 100; // начальная сумма
        int add_sum = 3000; // сумма пополнения
        int bonus_sum = 1; // бонус, если есть пополнение на сумму более 1000 руб за 100 руб
        int bonus_add_sum = add_sum / 100 * bonus_sum; // бонусная сумма
        int total; // итоговая сумма

        if (add_sum > 1000) {
            total = init_sum + add_sum + bonus_add_sum;
            System.out.println("Бонусных рублей: " + bonus_add_sum);
            System.out.println("Итоговый счёт: " + total);
        } else {
            bonus_add_sum = 0;
            total = init_sum + add_sum + bonus_add_sum;
            System.out.println("Бонусных рублей: " + bonus_add_sum);
            System.out.println("Итоговый счёт: " + total);
        }
    }
}