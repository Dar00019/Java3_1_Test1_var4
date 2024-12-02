package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpacecraftTest {

    @ParameterizedTest
    @CsvSource({"200", "50", "0", "-10"})
    @DisplayName("Test setWeight()")
    void setWeightTest(float weight) {
        Spacecraft spacecraft = new Spacecraft();
        try {
            spacecraft.setWeight(weight);
            Assertions.assertEquals(spacecraft.getWeight(), weight);
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Слишком малый вес космического корабля.");
        }
    }

    @ParameterizedTest
    @CsvSource({"150", "250"})
    @DisplayName("Test getWeight()")
    void getWeightTest(float expectedWeight) {
        Spacecraft spacecraft;
        if (expectedWeight == 150) {
            spacecraft = new Spacecraft();
        }
        else {
            spacecraft = new Spacecraft(expectedWeight);
        }
        Assertions.assertEquals(spacecraft.getWeight(), expectedWeight);
    }

    @Test
    void fly_objTest() {
        Spacecraft spacecraft = new Spacecraft();
        Assertions.assertEquals(spacecraft.fly_obj(), "Космический корабль отправился в космос.");
    }
}