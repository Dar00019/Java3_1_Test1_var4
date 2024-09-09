/*1. Найдите сумму последовательности натуральных чисел,
если признаком окончания конца последовательности
является два подряд идущих числа 0.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите последовательность натуральных чисел, заканчивающуюся нулём: ");
        int sum = 0;
        int number = 1;
        while (number != 0) {
            number = sc.nextInt();
            sum += number;
        }
        System.out.print("Сумма последовательности: " + sum);
        sc.close();
    }
}