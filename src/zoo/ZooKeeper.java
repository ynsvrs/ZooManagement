package zoo;

public class ZooKeeper {

    private String name;
    private int id;

    public ZooKeeper(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {

        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public void display() {
        System.out.println("Zookeeper name: " + name);
        System.out.println("Id: " + id);
    }
}
