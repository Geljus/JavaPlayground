import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);

            switch(n % 10){
                case 1:
                    System.out.printf("Последняя цифра числа - один"); break;
                case 2:
                    System.out.printf("Последняя цифра числа - два"); break;
                case 3:
                    System.out.printf("Последняя цифра числа - три"); break;
                case 4:
                    System.out.printf("Последняя цифра числа - четыре"); break;
                case 5:
                    System.out.printf("Последняя цифра числа - пять"); break;
                default:
                    System.out.printf("Последняя цифра числа - строго больше пяти или ноль"); break;
            }
        }

    }


