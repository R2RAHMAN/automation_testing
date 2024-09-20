package PL2;

public class Shape {
    protected String name;
    protected String color;
    protected double area;
    public Shape(String name, String color, double area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }
    public String getInfo() {
        return "My name: " + name + ", MY color: " + color+ ", MY area: " + area;
    }
    public String getName() {
        return name;
    }

}
