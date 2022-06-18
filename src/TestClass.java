import org.w3c.dom.css.CSSImportRule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(bufin.readLine());
//        System.out.println(a);
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a + " + " + b + " + " + c + " = "+ (a+b+c));
        System.out.println(a + " * " + b + " * " + c + " = "+ (a*b*c));
        System.out.println("("+a + " + " + b + ") * " + c + " = " + ((a+b)*c));

    }
}