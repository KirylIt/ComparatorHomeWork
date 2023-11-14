import java.util.Comparator;

public class Animal{
    private String name;
    private String colour;

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    static class AnimalNameComparator implements Comparator<Animal>{
        public int compare(Animal a, Animal b){
            return a.getName().compareTo(b.getName());
        }
    }
    static class AnimalColourComparator implements Comparator<Animal>{
        public int compare(Animal a, Animal b){
            return a.getColour().compareTo(b.getColour());
        }
    }
}


