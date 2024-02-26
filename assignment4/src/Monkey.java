public class Monkey extends Animal implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Uauaua");
    }
    public String toStr(){
        return "Monkey";
    }
    Monkey(String nameInput){
        setName(nameInput);
    }
}
