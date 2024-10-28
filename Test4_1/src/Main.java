/*Создать базовый класс «список» на основе обычного массива с
функциями вставки и удаления элементов.
Реализовать на базе списка производные классы стека и очереди.
Для каждого класса провести модульное тестирование основных методов класса.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Stack stack = new Stack(arrayList);
        stack.add(4);
        stack.add(5);
        System.out.println("Стек: ");
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.get(i) + " ");
            stack.remove();
        }
        Queue queue = new Queue(arrayList);
        queue.add(4);
        queue.add(5);
        System.out.println("\nОчередь: ");
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.print(queue.get(i) + " ");
            queue.remove();
        }
    }
}