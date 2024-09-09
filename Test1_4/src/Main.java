/*Дано натуральное число N. Найдите количество нулей среди всех цифр числа N.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = sc.nextInt();
        int CountOfNull = 0;
        while (N > 0) {
            if (N % 10 == 0) CountOfNull++;
            N /= 10;
        }
        System.out.print("Количество нулей в числе: " + CountOfNull);
        sc.close();
    }
}