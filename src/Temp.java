import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;
        String line;
        line ="";
        while (scanner.hasNext()){
            temp = scanner.next();
            line = line + " " + temp;
        }
        System.out.println(line);
    }

}
