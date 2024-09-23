/*4)	Написать регулярное выражение, определяющее
является ли данная строчка шестнадцатиричным идентификатором цвета в HTML.
Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.
– пример неправильных выражений: 232323, f#fddee, #fd2.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = sc.next();
        Pattern pattern = Pattern.compile("^[#][A-Fa-f0-9]{6}$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            System.out.print("Данная строка является шестнадцатиричным идентификатором цвета в HTML.");
        }
        else System.out.print("Данная строка не является шестнадцатиричным идентификатором цвета в HTML.");
        sc.close();
    }
}