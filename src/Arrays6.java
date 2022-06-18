import java.util.Scanner;

/*Обработка данных массива
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.
Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.
А если таких чисел в массиве нет, необходимо вывести -1.*/

public class Arrays6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = in.nextInt();
        int [] a = new int [volume];
        for (int i =0; i<volume; i++){
            a [i] = in.nextInt();
        }
        int count =0;
        for (int i:a) {
            if (i>9 && i<100 && (i % 2==0)) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count==0) System.out.print(-1);
    }
}
