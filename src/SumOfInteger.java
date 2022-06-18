import java.util.Arrays;
import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long sum=0;
        for (int i=0; i<num; i++) {
            sum=sum+(i+1);
        }
        System.out.println(sum);
    }
}
