public class AnimalCreator {
    public Animal createAnimal(String animalType, String animalName){
        Animal animal = null;
        switch (animalType){
            case "Tiger":
                animal = new Tiger(animalName);
            break;
            case "Rabbit":
                animal = new Rabbit(animalName);
            break;
            case "Monkey":
                animal = new Monkey(animalName);
            break;
            case "Elephant":
                animal = new Elephant(animalName);
            break;
            default:
                animal = new Animal(animalName);
        }
        return animal;
    }
}
