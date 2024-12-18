package zoo;

public class Animal {
    private String name;
    private int age;
    private String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHabitat() {
        return habitat;
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
