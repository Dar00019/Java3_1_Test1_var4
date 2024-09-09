/*5. Выведите все точные квадраты натуральных чисел,
не превосходящие данного числа N.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = sc.nextInt();
        for (int i = 1; i < N; i++) {
            System.out.print(i * i);
        }
        sc.close();
    }
}