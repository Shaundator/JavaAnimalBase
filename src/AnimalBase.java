import java.util.ArrayList;

public class AnimalBase {

    private ArrayList<Animal> animals;
    AnimalComparator comparator = new AnimalComparator();

    public AnimalBase() {
        animals = new ArrayList<>();
    }

    public void start() {
        UserInterface ui = new UserInterface(this);
        // TEST - REMOVE LATER!
        createNewAnimal("Bertil", "sleepy", "bull", 7);
        createNewAnimal("Abelone", "large", "elephant", 5);
        createNewAnimal("Crystal", "shiny", "turtle", 1);
        ui.start();
    }

    public static void main(String[] args) {
        AnimalBase app = new AnimalBase();
        app.start();
    }

    public Iterable<Animal> getAllAnimals() {
        return animals;
    }

    public void sortBy(String sort, String direction) {

        comparator.setDirection(direction);
        comparator.setSortBy(sort);

        animals.sort(comparator);
    }

    public void createNewAnimal(String name, String description, String type, int age) {
        Animal animal = new Animal(name,description,type,age);
        animals.add(animal);
    }

    public void deleteAnimal(String name) throws NonExistingAnimalException {
        // find animal with this name
        Animal animal = findAnimalByName(name);
        if(animal == null) {
            throw new NonExistingAnimalException();
        } else {
            animals.remove(animal);
        }
    }

    private Animal findAnimalByName(String name) {
        for(Animal animal : animals) {
            if(animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }


    public void loadDatabase() {
        System.err.println("LOAD not yet implemented!");
    }

    public void saveDatabase() {
        System.err.println("SAVE not yet implemented!");
    }

}
