import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        int size = 10;
        int[] numbers = {12, 6, 8, 11, 22, 5, 8, 15, 22, 0};
        System.out.println(numbers.length);

        int count = 0;
        for (int i = 1; i < numbers.length; i++){
            if ((i == numbers.length - 1) && (numbers[i - 1] > numbers[numbers.length - 1])){
                count++;
            }
            else if ((numbers[i - 1] > numbers[i]) && (numbers[i] < numbers[i + 1])){
                count++;
            }
        }
        System.out.print(count);
/*        for (int i = 0; i < count; i++){
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }*/

    }
}


