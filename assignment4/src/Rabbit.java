public class Rabbit extends Animal implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Frfrfr");
    }
    public String toStr(){
        return "Rabbit";
    }
    Rabbit(String nameInput){
        setName(nameInput);
    }
}
