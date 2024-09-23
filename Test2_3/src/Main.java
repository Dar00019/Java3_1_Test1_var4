/*3)	Пользователь вводит текст, состоящий из слов,
разделенных пробелами. В словах, начинающихся на «А» заменить
эту букву на «а». В полученном текст подсчитать количество слов, начинающихся на «а».*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        var strings = text.split(" ");
        int countOfWords = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(0) == 'A') {
                strings[i] = strings[i].replaceFirst("^A", "a");
                countOfWords++;
            }
            System.out.print(strings[i] + " ");
        }
        System.out.printf("\nКоличество слов, начинающихся с буквы \"А\": %d", countOfWords);
        sc.close();
    }
}