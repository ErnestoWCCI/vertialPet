package pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    private VirtualPet pet;

    @BeforeEach
    public void setup() {
        pet = new VirtualPet();
    }

    @Test
    public void testInitialPetState() {
        Assertions.assertEquals(50, pet.getHappiness());
        Assertions.assertEquals(50, pet.getHunger());
    }

    @Test
    public void testPetting() {
        pet.pet();
        Assertions.assertEquals(60, pet.getHappiness());
        Assertions.assertEquals(55, pet.getHunger());
    }

    @Test
    public void testPlaying() {
        pet.play();
        Assertions.assertEquals(70, pet.getHappiness());
        Assertions.assertEquals(65, pet.getHunger());
    }

    @Test
    public void testFeeding() {
        pet.feed();
        Assertions.assertEquals(55, pet.getHappiness());
        Assertions.assertEquals(30, pet.getHunger());
    }

    @Test
    public void testDoNothing() {
        pet.doNothing();
        Assertions.assertEquals(40, pet.getHappiness());
        Assertions.assertEquals(55, pet.getHunger());
    }

    @Test
    public void testHappinessLimits() {
        pet.setHappiness(0);
        Assertions.assertEquals(0, pet.getHappiness());

        pet.setHappiness(100);
        Assertions.assertEquals(100, pet.getHappiness());
    }

    @Test
    public void testHungerLimits() {
        pet.setHunger(0);
        Assertions.assertEquals(0, pet.getHunger());

        pet.setHunger(100);
        Assertions.assertEquals(100, pet.getHunger());
    }
}
