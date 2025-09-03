public class Bill {
    int id;
    String name;
    double amount;

    public Bill(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + amount;
    }
}
