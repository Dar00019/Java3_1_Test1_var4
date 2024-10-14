/*1. В файле input.txt задан список целых чисел и число X.
Не используя вспомогательных объектов и не изменяя размера списка,
переставить элементы списка так, чтобы сначала шли числа,
не превосходящие X, а затем числа, больше X.*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fileIn = new FileReader("D:/ProgrFiles/inputJavaNums.txt");
        BufferedReader buffReader = new BufferedReader(fileIn);
        int X = Integer.parseInt(buffReader.readLine());
        String[] strings = buffReader.readLine().split("\\s");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.printf("X = %d\n", X);
        for (int i = 1; i < strings.length; i++) {
            list.add(Integer.parseInt(strings[i]));
        }
        Collections.sort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
        fileIn.close();
        buffReader.close();
    }
}