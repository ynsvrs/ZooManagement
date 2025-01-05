package zoo;

public class Animal {

    public Animal() {}


    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    private String name;
    private int age;
    private String habitat;


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


    public void display() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
        System.out.println("Animal habitat: " + habitat);
    }
}
