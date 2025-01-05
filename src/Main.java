import zoo.Animal;
import zoo.Zoo;
import zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Panda", 5, "forest");
        animals[1] = new Animal("Lion", 15, "desert");
        animals[2] = new Animal("Elephant", 25, "savannah");

        Zoo[] zoos = new Zoo[2];
        zoos[0] = new Zoo("Astana Zoo", animals);
        zoos[1] = new Zoo("Safari Park", animals);

        zoos[0].getAvailableAnimals();
        zoos[1].getAvailableAnimals();
        System.out.println();

        ZooKeeper zooKeeper1 = new ZooKeeper("Saniya", 27);
        ZooKeeper zooKeeper2 = new ZooKeeper("Sunghoon", 35);
        ZooKeeper zooKeeper3 = new ZooKeeper("Dair", 40);

        zooKeeper1.display();
        zooKeeper2.display();
        zooKeeper3.display();
        System.out.println();

        zooKeeper1.isOlderThan(zooKeeper2);
        zooKeeper2.isOlderThan(zooKeeper3);
    }
}
