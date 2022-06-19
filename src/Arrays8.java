/*Сортировка массива по возрастанию
Дано натуральное число N, далее следуют N целых чисел.
Необходимо вывести на консоль отсортированную последовательность.*/

import java.util.Arrays;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = in.nextInt();
        int [] a = new int [volume];
        for (int i =0; i<volume; i++){
            a [i] = in.nextInt();
        }
        Arrays.sort(a);
        for (int i:a) {
            System.out.print(i + " ");
        }
    }
}
