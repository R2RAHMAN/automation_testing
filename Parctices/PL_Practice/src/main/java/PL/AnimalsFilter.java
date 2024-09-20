package PL;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalsFilter {
    public static List<Animal> FilterByAge(List<Animal> animals, int MinAge) {
        return animals.stream()
                .filter(animal -> animal.getAge() > MinAge)
                .collect(Collectors.toList());
    }
}
