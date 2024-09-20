package PL2;

public class Square extends Shape{
    protected double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"MY side: " + side;
    }

}
