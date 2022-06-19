/*Нарушенный порядок
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.
Порядок нарушен тогда, когда среди двух соседних элементов массива левый элемент больше правого.
Программа должна считать количество нарушенных порядков в массиве и выводить это количество на экран.*/

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = in.nextInt();
        int [] a = new int [volume];
        for (int i =0; i<volume; i++){
            a [i] = in.nextInt();
        }
        int count =0;
        for (int i=0; i<(volume-1); i++) {
            if (a[i]>a[i+1]) {
                count++;
            }
        }
        System.out.print(count);
    }
}

