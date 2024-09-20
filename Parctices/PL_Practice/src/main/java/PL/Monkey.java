package PL;

public class Monkey extends Animal {
    private String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }
    @Override
    public void EatFood() {
        System.out.println("This monkey loves " + foodType);
    }
}
