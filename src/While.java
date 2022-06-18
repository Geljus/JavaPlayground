import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class While {
    public static void main(String [] args){
       Scanner in  =   new Scanner(System.in);
        int a = in.nextInt();
        int b;
        String temp = "";
        while (!(a == 0)){
            b= a%2;
            temp = b + temp;
            a=a/2;
        }
        System.out.println(temp);
    }
}