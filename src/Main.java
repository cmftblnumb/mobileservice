//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double initialBalance = 100;
        double replenishmentBalance = 1100;
        double bonus = 0;

        if (replenishmentBalance > 1000) {
           bonus = (replenishmentBalance / 100);
        }
        double finalBalance = initialBalance + replenishmentBalance + bonus;

        System.out.printf("Итоговый счет: %.2f%n", finalBalance);
        System.out.printf("Бонусные рубли: %.2f%n", bonus);
    }
}