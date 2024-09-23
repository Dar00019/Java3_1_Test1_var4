/*1) Напишите программу, проверяющую, является ли введенная строка
 десятичным числом с целой и дробной частью
 (шаблон: состоит из одной или нескольких цифр,
 одной десятичной точки, которая может быть в начале,
 в середине или в конце числа,  и, кроме того, первым символом числа
 может быть знак "+" или "-"). Если это так,
то программа должна вывести количество знаков в целой
и количество знаков в дробной части числа.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = sc.next();
        Pattern pattern = Pattern.compile("^[+-]?\\d+\\.\\d*$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            System.out.print("Введённая строка является десятичным числом с целой и дробной частью.\n");
            boolean FirstPart = true;
            int countOfFirstPart = 0;
            int countOfSecondPart = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '.') {
                    FirstPart = false;
                }
                if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                    if (FirstPart) countOfFirstPart++;
                    else countOfSecondPart++;
                }
            }
            System.out.printf("Количество знаков в целой части: %d, в дробной части: %d", countOfFirstPart, countOfSecondPart);
        }
        else
            System.out.print("Введённая строка не является десятичным числом с целой и дробной частью.");
        sc.close();
    }
}