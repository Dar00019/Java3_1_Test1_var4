/*Создать базовый класс «список» на основе обычного массива с
функциями вставки и удаления элементов.
Реализовать на базе списка производные классы стека и очереди.
Для каждого класса провести модульное тестирование основных методов класса.*/

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        Stack stack = new Stack(array);
        stack = stack.add(4);
        stack = stack.add(5);
        System.out.println("Стек: ");
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.get() + " ");
            stack = stack.remove();
        }
        Queue queue = new Queue(array);
        queue = queue.add(4);
        queue = queue.add(5);
        System.out.println("\nОчередь: ");
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.print(queue.get() + " ");
            queue = queue.remove();
        }
    }
}