package lessons.lambdas;

public class Client {
    private String name;
    private int sum;
    boolean isActive;

    public Client(String name, int sum, boolean isActive) {
        this.name = name;
        this.sum = sum;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
