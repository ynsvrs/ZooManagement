package zoo;

public class Zoo {
    private String name;
    private String origin;
    private Animal[] animals;

    // Constructor for Zoo
    public Zoo(String name, String origin, Animal[] animals) {
        this.name = name;
        this.origin = origin;
        this.animals = animals;
    }

    // Get and display available animals
    public void getAvailableAnimals() {
        System.out.println("Available animals in the zoo " + this.name + ":");
        for (Animal animal : animals) {
            animal.display();
        }
    }
}

