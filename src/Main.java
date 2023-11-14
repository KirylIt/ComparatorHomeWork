import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Теперь коллекцию из элементов Animal следует
        //сравнивать не только по полю name, но и по полю colour.

        Comparator<Animal> acomp = new Animal.AnimalNameComparator().thenComparing(new Animal.AnimalColourComparator());
        TreeSet<Animal> animals = new TreeSet<>(acomp);
        animals.add(new Animal("Cat", "White"));
        animals.add(new Animal("Cat", "Black"));
        animals.add(new Animal("Dog", "Red"));
        animals.add(new Animal("Dog", "Blue"));
        animals.add(new Animal("Elk", "White"));
        animals.add(new Animal("Elk", "Yellow"));
        animals.add(new Animal("Frog", "Yellow"));
        animals.add(new Animal("Frog", "Green"));
        animals.add(new Animal("Elephant", "Pink"));
        animals.add(new Animal("Elephant", "Brown"));
        animals.add(new Animal("Parrot", "Orange"));
        animals.add(new Animal("Parrot", "Violet"));
        animals.add(new Animal("Wolf", "Grey"));
        animals.add(new Animal("Wolf", "Black"));
        animals.add(new Animal("Mouse", "Pink"));
        animals.add(new Animal("Mouse", "Blue"));

        for (Animal a:animals) {
            System.out.println(a.getName() + " " + a.getColour());
        }

    }
}