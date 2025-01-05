package zoo;

public class Animal {
    private String name;
    private int age;
    private String habitat;

    // Constructor for Animal
    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Display animal information
    public void display() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
        System.out.println("Animal habitat: " + habitat);
    }

    // WhoIsOlder method (comparing animal ages)
    public boolean WhoIsOlder(Animal secondAnimal) {
        if (this.age > secondAnimal.age) {
            System.out.println(this.name + " is older than " + secondAnimal.name);
        } else if (this.age < secondAnimal.age) {
            System.out.println(this.name + " is younger than " + secondAnimal.name);
        } else {
            System.out.println(this.name + " and " + secondAnimal.name + " are the same age");
        }
        return false;
    }
}
