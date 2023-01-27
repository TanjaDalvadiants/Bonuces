import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Примеры. Начальные данные: у клиента на счету 100 рублей.
        //
        //Клиент пополнил счёт на 100 рублей — бонусов нет, итоговая сумма на счету клиента — 200 рублей.
        //Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям, итоговая сумма на счету клиента — 1211 рублей.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму пополнения:");
        int sumOfDeposit = scan.nextInt();
        System.out.println("Если Ваш счёт пополнен более чем на 1000 рублей, то сотовый оператор дарит Вам 1 рубль " +
                "за каждые полные 100 рублей пополнения");
        System.out.println("Сумма ппополнения:" + sumOfDeposit + "руб.");

        int sumOfBonus=sumOfDeposit/100;


        if (sumOfDeposit > 1000) {
            System.out.println("Бонусы зачислены и составляют:"+ sumOfBonus + "руб.");
        } else {
            System.out.println("Бонусы не зачислены");
        }

        int amount=100;
        int amountCommon=sumOfDeposit + amount+sumOfBonus;
        System.out.println("Сумма на счете:" + amountCommon + "руб.");









    }
}