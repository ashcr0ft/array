import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ledger = new int[5];
        int sum = 0;
        ledger[0] = 14000;
        ledger[1] = 45400;
        ledger[2] = 16890;
        ledger[3] = 35889;
        ledger[4] = 34322;
        for (int j : ledger) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        int maxAmount = ledger[0];
        int minAmount = ledger[0];
        for (int i = 0; i < ledger.length; i++) {
            if (ledger[i] > maxAmount) {
                maxAmount = ledger[i];
            }
            if (ledger[i] < minAmount) {
                minAmount = ledger[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxAmount + " рублей");

        System.out.println("Средняя сумма трат за месяц составила "
                + (float) sum / ledger.length + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            char cash = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = cash;
        }
        System.out.println(reverseFullName);

    }
}




