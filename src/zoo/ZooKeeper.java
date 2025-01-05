package zoo;

public class ZooKeeper {

    public ZooKeeper() {}

    public ZooKeeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void isOlderThan(ZooKeeper otherZookeeper) {
        if (this.age > otherZookeeper.getAge()) {
            System.out.println(this.name + " is older than " + otherZookeeper.getName());
        } else {
            System.out.println(this.name + " is not older than " + otherZookeeper.getName());
        }
    }


    public void display() {
        System.out.println("Zookeeper name: " + name);
        System.out.println("Age: " + age);
    }
}
