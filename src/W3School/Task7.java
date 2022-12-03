package W3School;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplication = a * i;
            System.out.println(a + " x " + i + " = " + multiplication);
        }
    }
}