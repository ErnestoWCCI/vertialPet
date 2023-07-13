package pet;

public class VirtualPet {
    private int happiness;
    private int hunger;

    public VirtualPet() {
        happiness = 50;
        hunger = 50;
    }

    public void pet() {
        happiness += 10;
        hunger += 5;
        System.out.println("You pet the pet.");
        updateStatus();
    }

    public void play() {
        happiness += 20;
        hunger += 15;
        System.out.println("You played with the pet.");
        updateStatus();
    }

    public void feed() {
        happiness += 5;
        hunger -= 20;
        System.out.println("You fed the pet.");
        updateStatus();
    }

    public void doNothing() {
        happiness -= 10;
        hunger += 5;
        System.out.println("You did nothing.");
        updateStatus();
    }

    

    private void updateStatus() {
        if (happiness < 0) happiness = 0;
        if (happiness > 100) happiness = 100;
        if (hunger < 0) hunger = 0;
        if (hunger > 100) hunger = 100;

        System.out.println("Happiness: " + happiness);
        System.out.println("Hunger: " + hunger);

        if (happiness <= 0 || hunger >= 100) {
            System.out.println("Oh no! The pet is unhappy or hungry. Game over.");
            System.exit(0);
        }}

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHappiness(int i) {
        happiness = i;
    }

    public void setHunger(int i) {
        hunger = i;
    }
}
