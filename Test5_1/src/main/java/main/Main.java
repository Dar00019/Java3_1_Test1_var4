/*1.Создайте интерфейс, содержащий три метода, в его собственном пакете.
Реализуйте этот интерфейс в другом пакете.
Протестируйте созданную реалиализацию на Unit-тестах.*/

package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Spacecraft spacecraft1 = new Spacecraft(150);
        Spacecraft spacecraft2 = new Spacecraft(300);
        Spacecraft spacecraft3 = new Spacecraft(200);

        ArrayList<Spacecraft> arraySpacecrafts = new ArrayList<>();
        arraySpacecrafts.add(spacecraft1);
        arraySpacecrafts.add(spacecraft2);
        arraySpacecrafts.add(spacecraft3);

        Collections.sort(arraySpacecrafts, (a, b) -> (int) (a.getWeight() - b.getWeight()));

        for (Spacecraft spacecraft : arraySpacecrafts) {
            System.out.println(spacecraft.getWeight());
        }
    }
}
