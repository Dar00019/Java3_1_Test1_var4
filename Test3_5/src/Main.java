/*5. Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("89-00-89", "Смирнов");
        map.put("23-00-00", "Сидорова");
        map.put("89-00-88", "Смирнов");
        map.put("20-10-00", "Козлов");
        map.put("80-01-80", "Смирнова");
        map.put("23-10-10", "Сидорова");
        map.put("89-22-89", "Смирнов");
        map.put("23-06-06", "Комарова");
    }
}