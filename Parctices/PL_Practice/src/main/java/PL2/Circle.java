package PL2;

public class Circle extends Shape{

        protected double radius;

        public Circle(String name, String color, double radius) {
            super(name, color);
            this.radius = radius;
        }
        @Override
        public String getInfo() {
            return super.getInfo()+"MY radius: " + radius;
        }
}
