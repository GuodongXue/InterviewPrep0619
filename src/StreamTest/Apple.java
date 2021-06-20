package StreamTest;

public class Apple {
    private int id;
    private String color;
    private String location;
    private int weight;

    public Apple(int id, String color, String location, int weight) {
        this.id = id;
        this.color = color;
        this.location = location;
        this.weight = weight;
    }



    public Apple() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", location='" + location + '\'' +
                ", weight=" + weight +
                '}';
    }
}
