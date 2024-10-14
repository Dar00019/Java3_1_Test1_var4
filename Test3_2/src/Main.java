/*2. Во входном файле расположены два набора положительных чисел;
между наборами стоит отрицательное число. Построить два списка C1 и С2,
элементы которых содержат соответственно числа 1-го и 2-го набора таким образом,
чтобы внутри одного списка числа были упорядочены по возрастанию.
Затем объединить списки C1 и С2 в один упорядоченный список. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fileIn = new FileReader("D:/ProgrFiles/JavaPositiveNums.txt");
        BufferedReader buffReader = new BufferedReader(fileIn);
        String[] strings = buffReader.readLine().split("\\s");
        ArrayList<Integer> listC1 = new ArrayList<>();
        ArrayList<Integer> listC2 = new ArrayList<>();
        boolean isFirstList = true;
        for (int i = 1; i < strings.length; i++) {
            Integer num = Integer.parseInt(strings[i]);
            if (num < 0)
                isFirstList = false;
            else if (isFirstList)
                listC1.add(num);
            else
                listC2.add(num);
        }
        Collections.sort(listC1);
        Collections.sort(listC2);
        System.out.print("C1: ");
        for (int num : listC1) {
            System.out.print(num + " ");
        }
        System.out.print("\nC2: ");
        for (int num : listC2) {
            System.out.print(num + " ");
        }
        listC1.addAll(listC2);
        Collections.sort(listC1);
        System.out.print("\nC1 + C2: ");
        for (int num : listC1) {
            System.out.print(num + " ");
        }
        fileIn.close();
        buffReader.close();
    }
}