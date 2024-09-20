package PL2;

public class Rectrangle extends Shape{
    protected double sideA;
    protected double sideB;

    public Rectrangle(String name, String color, double width, double height) {
        super(name, color);
        this.sideA = width;
        this.sideB = height;

    }
    @Override
    public String getInfo() {
        return super.getInfo()+"MY width: " + sideA + ", MY height: " + sideB;
    }



}
