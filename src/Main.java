import zoo.Animal;
import zoo.Zoo;
import zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        // Create animals
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Panda", 5, "forest");
        animals[1] = new Animal("Lion", 15, "desert");
        animals[2] = new Animal("Elephant", 25, "savannah");

        // Create zoos
        Zoo[] zoos = new Zoo[2];
        zoos[0] = new Zoo("Astana Zoo", "Kazakhstan", animals);
        zoos[1] = new Zoo("Safari Park", "South Africa", animals);

        // Set and get available animals at each zoo
        zoos[0].getAvailableAnimals();
        zoos[1].getAvailableAnimals();
        System.out.println();

        // Create zookeepers
        ZooKeeper zooKeeper1 = new ZooKeeper("Saniya", 27, animals[0]);
        ZooKeeper zooKeeper2 = new ZooKeeper("Sunghoon", 35, animals[1]);
        ZooKeeper zooKeeper3 = new ZooKeeper("Dair", 40, animals[2]);

        // Display information about animals (we remove the lines that print full zoo keeper info)
        // System.out.println(zooKeeper1.getAnimalFullInfo());
        // System.out.println(zooKeeper2.getAnimalFullInfo());
        // System.out.println(zooKeeper3.getAnimalFullInfo());
        System.out.println();

        // Check which zookeeper is older than the other
        zooKeeper1.isOlderThan(zooKeeper2);
        zooKeeper2.isOlderThan(zooKeeper3);
    }
}
