package zoo;

public class ZooKeeper {
    private String name;
    private int age;
    private Animal animal;

    // Constructor for ZooKeeper
    public ZooKeeper(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    // Display information for the assigned animal
    public String getAnimalFullInfo() {
        return (this.getName() + " is taking care of " + this.animal.getName());
    }

    // Check if the zoo keeper is older than another
    public void isOlderThan(ZooKeeper zooKeeper) {
        if (this.age > zooKeeper.getAge()) {
            System.out.println(this.name + " is older than " + zooKeeper.getName());
        } else {
            System.out.println(this.name + " is not older than " + zooKeeper.getName());
        }
    }
}

