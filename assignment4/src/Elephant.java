public class Elephant extends Animal implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Uuuuu");
    }
    public String toStr(){
        return "Elephant";
    }
    Elephant(String nameInput){
        setName(nameInput);
    }
}
