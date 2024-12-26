package zoo;

public class Zoo {
    public Zoo(){

    }
    public Zoo(String name){
        this.name = name;
    }

    private String name;
    private Animal animal1;
    private Animal animal2;
    private ZooKeeper zooKeeper1;
    private ZooKeeper zooKeeper2;


    public void setAnimal(Animal animal){
        animal1 = animal;
    }
    public void getAnimal(){
        System.out.println(animal1);
    }
    public void setAnimal2(Animal animal){
        animal2 = animal;
    }
    public void getAnimal2(){
        System.out.println(animal2);
    }
    public void setZooKeeper(ZooKeeper zooKeeper){
        zooKeeper1 = zooKeeper;
    }
    public void getZooKeeper(){
        System.out.println(zooKeeper1);
    }
    public void setZooKeeper2(ZooKeeper zooKeeper){
        zooKeeper2 = zooKeeper;
    }
    public void getZooKeeper2(){
        System.out.println(zooKeeper2);
    }
    public void display(){
        System.out.println("Zoo Name: " + this.name);
        if (animal1 != null){
            animal1.display();
        }
        if (animal2 != null){
            animal2.display();
        }
        if (zooKeeper1 != null){
            zooKeeper1.display();
        }
        if (zooKeeper2 != null){
            zooKeeper2.display();
        }
    }
}
