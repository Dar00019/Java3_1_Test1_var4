package main;

import flyable.Flyable;

public class Spacecraft implements Flyable {
    private Float weight = new Float(150);

    public Spacecraft() {
    }

    public Spacecraft(float weight) {
        this.weight = weight;
    }

    public void setWeight(float weight) throws Exception {
        if (weight < 50) {
            throw new Exception("Слишком малый вес космического корабля.");
        }
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String fly_obj() {
        return "Космический корабль отправился в космос.";
    }
}
