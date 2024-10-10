//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double initialbalance = 100;
        double replenishmentbalance = 1500;
        double bonus = 0;

        if (replenishmentbalance > 1000) {
            bonus = (replenishmentbalance - 1000) / 100;
        }
        double finalbalance = initialbalance + replenishmentbalance + bonus;

        System.out.printf("Итоговый счет: %.2f%n", finalbalance);
        System.out.printf("Бонусные рубли: %.2f%n", bonus);
    }
}