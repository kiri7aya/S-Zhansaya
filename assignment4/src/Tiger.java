public class Tiger extends Animal implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Rrrrr");
    }
    public String toStr(){
        return "Tiger";
    }
    Tiger(String nameInput){
        setName(nameInput);
    }
}
