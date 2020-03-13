public class MathOperationsDemo {
    public static void main(String[] args) {
        int carPriceMercedes = 35000;
        int carPriceGeely = 12000;
        int carPriceRenault = 15800;
        int carPriceBugatti = 70002;
        int carPriceToyota = 23000;
        int numberCarSold = 5;
        double discountPercentMercedes = 10;
        int costAllCars = carPriceMercedes + carPriceGeely + carPriceRenault + carPriceBugatti + carPriceToyota;
        double averageCarPrice = (double) costAllCars / 5;
        int discountPriceMercedes = carPriceMercedes * (100 - 10) / 100;
        String parityCar;
        if (numberCarSold % 2 == 0){
            parityCar = "четное";
        } else {parityCar = "нечетное";}

        System.out.println("Стоимость автомобиля Mercedes = " + carPriceMercedes + " USD" + '\n' +
                "Стоимость автомобиля Mercedes со скидкой - " + discountPercentMercedes + "% " + "= "
                + discountPriceMercedes + " USD" );
        System.out.println("Стоимость автомобиля Geely = " + carPriceGeely + " USD");
        System.out.println("Стоимость автомобиля Renault = " + carPriceRenault + " USD");
        System.out.println("Стоимость автомобиля Bugatti = " + carPriceBugatti + " USD");
        System.out.println("Стоимость автомобиля Toyota = " + carPriceToyota + " USD");
        System.out.println("Общая стоимость всех автомобилей = " + costAllCars + " USD");
        System.out.println("Средняя стоимость автомобиля = " + averageCarPrice + " USD");
        System.out.println("Количество автомобилей в продаже " + numberCarSold  + "-" + parityCar);
    }
}
