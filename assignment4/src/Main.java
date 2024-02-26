import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        AnimalCreator ac = new AnimalCreator();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose the option: ");
            System.out.println("1. Add animal");
            System.out.println("2. Sound animal");
            System.out.println("3. Delete animal");
            System.out.println("4. List animals");
            int choice = sc.nextInt();
            int animalChoice = 0;
            int i = 0;
            switch (choice){
                case 1:
                    System.out.println("Choose the animal: ");
                    System.out.println("1. Tiger");
                    System.out.println("2. Monkey");
                    System.out.println("3. Rabbit");
                    System.out.println("4. Elephant");
                    animalChoice = sc.nextInt();
                    System.out.println("Write name: ");
                    String name = sc.next();
                    switch (animalChoice){
                        case 1:
                            animals.add(ac.createAnimal("Tiger", name));
                        break;
                        case 2:
                            animals.add(ac.createAnimal("Monkey", name));
                            break;
                        case 3:
                            animals.add(ac.createAnimal("Rabbit", name));
                            break;
                        case 4:
                            animals.add(ac.createAnimal("Elephant", name));
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                break;
                case 2:
                    i = 1;
                    System.out.println("Choose the animal: ");
                    for(Animal animal : animals){
                        System.out.println(i + ". " + animal.toStr() + " " + animal.getName());
                        i++;
                    }
                    animalChoice = sc.nextInt() - 1;
                    animals.get(animalChoice).makeSound();
                break;
                case 3:
                    i = 1;
                    System.out.println("Choose the animal: ");
                    for(Animal animal : animals){
                        System.out.println(i + ". " + animal.toStr() + " " + animal.getName());
                        i++;
                    }
                    animalChoice = sc.nextInt() - 1;
                    animals.remove(animalChoice);
                break;
                case 4:
                    i = 1;
                    for(Animal animal : animals){
                        System.out.println(i + ". " + animal.toStr() + " " + animal.getName());
                        i++;
                    }
            }
        }
    }
}