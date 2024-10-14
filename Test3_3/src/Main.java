/*3. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк по длине.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fileIn = new FileReader("D:/ProgrFiles/JavaStrings.txt");
        BufferedReader buffReader = new BufferedReader(fileIn);
        ArrayList<String> strings = new ArrayList<>();
        while (buffReader.ready()) {
            String oneString = buffReader.readLine();
            strings.add(oneString);
        }
        Collections.sort(strings);
        for (String s : strings) {
            System.out.print(s + '\n');
        }
        fileIn.close();
        buffReader.close();
    }
}