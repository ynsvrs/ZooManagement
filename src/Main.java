import zoo.Animal;
import zoo.Zoo;
import zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Astana Zoo");
        ZooKeeper zookeeper1 = new ZooKeeper("Saniya", 311206);
        ZooKeeper zookeeper2 = new ZooKeeper("Sunghoon", 120802);
        Animal animal1 = new Animal("Panda", 5, "forest");
        Animal animal2 = new Animal("Lion", 15, "desert");
        zoo.setAnimal(animal1);
        zoo.setAnimal2(animal2);
        zoo.setZooKeeper(zookeeper1);
        zoo.setZooKeeper2(zookeeper2);
        animal1.WhoIsOlder(animal2);
        zoo.display();
    }
}