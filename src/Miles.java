public class Miles {

    public static void main(String[] args) {

        int price = 5_000; // стоимость билета в рублях
        int step = 20; // шаг начисления одной мили
        int miles = (price / step); // расчёт количества миль
        System.out.println
                ("За Ваши потраченные " + price + " рублей, Вам будет начислено " + miles + " бонусных миль.");

    }
}