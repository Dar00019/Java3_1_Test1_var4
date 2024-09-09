/*3. По данному натуральному числу N найдите
сумму чисел 1+1/1!+1/2!+1/3!+...+1/N!.
Количество действий должно быть пропорционально N.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = sc.nextInt();
        double sum = 1;
        int factorial = 1;
        for (int i = 1; i < N; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }
        System.out.printf("Сумма ряда: %.5f", sum);
        sc.close();
    }
}