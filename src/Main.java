

public class Main {
    public static void main(String[] args) {


        int sumOfDeposit = 100;
        System.out.println("Если Ваш счёт пополнен более чем на 1000 рублей, то сотовый оператор дарит Вам 1 рубль " +
                "за каждые полные 100 рублей пополнения.");
        System.out.println("Сумма ппополнения:" + sumOfDeposit + "руб.");

        int sumOfBonus = sumOfDeposit / 100;
        int amount = 100;
        int amountCommonFirst = sumOfBonus + amount + sumOfDeposit;
        int amountCommonSecond = amount + sumOfDeposit;


        if (sumOfDeposit > 1000) {
            System.out.println("Бонусы зачислены и составляют:" + sumOfBonus + "руб.");
        } else {
            System.out.println("Бонусы не зачислены:" + 0 + "руб.");
        }

        if (sumOfDeposit < 1000) {
            System.out.println("На счете:" + amountCommonSecond + "руб.");
        } else {
            System.out.println("На счете:" + amountCommonFirst + "руб.");
        }

    }
}