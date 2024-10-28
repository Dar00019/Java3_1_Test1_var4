/*Создать базовый класс с функцией – сумма прогрессии.
Создать производные классы: арифметическая прогрессия и геометрическая прогрессия.
Каждый класс имеет два поля типа double. Первое – первый член прогрессии,
второе – постоянная разность (для арифметической) и постоянное отношение (для геометрической).
Определить функцию вычисления суммы, где параметром является количество элементов прогрессии. */

public class Main {
    public static void main(String[] args) {
        ArithmeticProgress aProgress = new ArithmeticProgress(0, 2);
        System.out.println(aProgress.getElem(5));
        try {
            GeometryProgress bProgress = new GeometryProgress(1, 2);
            System.out.println(bProgress.sum(7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}