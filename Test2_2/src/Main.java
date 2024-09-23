/*2)	Возрастающей подпоследовательностью будем называть
последовательность символов, расположенных в порядке
увеличения их номера в кодовой таблице символов ASCII.
Во веденной строке определите длину наибольшей возрастающей
подпоследовательности, содержащейся в ней.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = sc.next();
        int maxLength = 0;
        int lengthOfString = 0;
        for (int i = 0; i < string.length()-1; i++) {
            if (string.charAt(i) < string.charAt(i+1)) {
                lengthOfString++;
                if (lengthOfString > maxLength) {
                    maxLength = lengthOfString;
                }
            }
            else lengthOfString = 0;
        }
        System.out.printf("Длина наибольшей возрастающей последовтельности: %d", maxLength);
        sc.close();
    }
}