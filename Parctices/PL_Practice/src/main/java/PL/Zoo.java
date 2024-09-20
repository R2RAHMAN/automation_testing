package PL;

import java.util.List;

public class Zoo {
    private String city;
    private List<Animal> animals;

    public Zoo(String city, List<Animal> animals) {
        this.city = city;
        this.animals = animals;
    }

    public void PrintAnimals() {
        System.out.println("In " + city + " zoo we have animals:");
        for (Animal animal : animals) {
            animal.PrintInfo();
        }
    }

    public void FeedAnimals() {
        System.out.println("Let's feed animals in " + city + " Zoo!");
        int i = 0;
        while (i < animals.size()) {
            animals.get(i).EatFood();
            i++;
        }
    }
    public String GetCity() {
        return city;
    }
}
