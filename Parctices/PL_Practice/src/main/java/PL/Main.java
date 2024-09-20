package PL;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(25, 70));
        animalList.add(new Animal(3, 4.55));
        animalList.add(new Monkey(7, 39.5, "Banana"));
        animalList.add(new Donkey(12, 69, "Donny"));
        animalList.add(new Monkey(18, 75, "Bamboo"));
        animalList.add(new Donkey(2, 32.2, "Little"));

        Zoo myZoo = new Zoo("New York", animalList);
        myZoo.PrintAnimals();
        myZoo.FeedAnimals();

        System.out.println("\n\n\n Animals filtered by age\n\n\n");
        List<Animal> filteredAnimals = AnimalsFilter.FilterByAge(animalList, 10);
        Zoo filteredZoo = new Zoo("City of grown-up animals", filteredAnimals);
        filteredZoo.PrintAnimals();

        List<Zoo> zoos = new ArrayList<>();
        zoos.add(myZoo);
        zoos.add(filteredZoo);

        System.out.println("Practice with lambda");
        zoos.stream()
                .filter(zoo -> zoo.GetCity().contains("grown-up"))
                .forEach(Zoo::PrintAnimals);


    }
}
