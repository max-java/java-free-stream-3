
import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int oneRandomNumber = (int) (Math.random() * 100);
        int twoRandomNumber = (int) (Math.random() * (5+1)+1);
        Random randomGenerator = new Random();
        int threeRandomNumber = randomGenerator.nextInt(6);
        int sumRandomNumbers = oneRandomNumber + twoRandomNumber + threeRandomNumber;

        System.out.println("Первое случайное число = " + oneRandomNumber);
        System.out.println("Второе случайное число = " + twoRandomNumber);
        System.out.println("Третье случайное число = " + threeRandomNumber);
        System.out.println("Сумма всех случайных чисел = " + sumRandomNumbers);
    }

}
