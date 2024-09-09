/*2. По данному числу n вычислите сумму 1+1/2^2+1/3^2+...+1/n^2.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.print("Сумма ряда: " + sum);
        sc.close();
    }
}