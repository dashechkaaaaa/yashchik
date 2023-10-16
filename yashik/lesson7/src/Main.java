import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int toInt(int number) {

        String stringOfNumbers = Integer.toString(number);
        char[] charNumbers = stringOfNumbers.toCharArray();
        int[] arrNumbers = new int[charNumbers.length];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Character.getNumericValue(charNumbers[i]);
        }

        StringBuilder stringNumbers = new StringBuilder();
        for (int i = 0; i < arrNumbers.length; i++) {
            stringNumbers.append(Integer.toString(arrNumbers[i]));
        }

        return Integer.parseInt(stringNumbers.toString());
    }
    public static void isEven(int[] arr) {
        System.out.print("Четные элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static int sumOfNumbers(int[] arr, int leftBound, int rightBound) {
        int sum = 0;
        for (int i = leftBound; i < rightBound; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Введите левую границу интервала:");
        int leftBound = scanner.nextInt();
        System.out.println("Введите правую границу интервала:");
        int rightBound = scanner.nextInt();

        if ((leftBound > rightBound) || (rightBound < 0) || (leftBound < 0)) {
            System.out.println("Неверно введены границы интервала");
        }
        else {
            int result = sumOfNumbers(arr, leftBound, rightBound);
            System.out.println("Сумма чисел:");
            System.out.println(result);
        }

        isEven(arr);

        int number = scanner.nextInt();
        System.out.print(toInt(number));
    }
}
