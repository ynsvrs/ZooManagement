package zoo;

public class Zoo {
    public Zoo() {}

    public Zoo(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
    }

    private String name;
    private Animal[] animals;


    public void getAvailableAnimals() {
        System.out.println("Available animals at " + this.name + ":");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println();  // Add a blank line for readability
        }
    }

    public String getName() {
        return this.name;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}


