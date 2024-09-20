package PL;

public class Donkey extends Animal {
    private  String name;

    public Donkey(int age, double weight, String name) {
        super(age, weight);
        this.name = name;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Donkey with name " + name + ": age " + super.age + ", weight " + super.weight);
    }
}
