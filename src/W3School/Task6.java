package W3School;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int minus = a - b;
        int multiplication = a * b;
        int divide = a / b;
        int mod = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " +minus);
        System.out.println(a + " x" + b + " = " +multiplication);
        System.out.println(a + " / " + b + " = " +divide);
        System.out.println(a + " mod " + b + " = " +mod);
    }
}

