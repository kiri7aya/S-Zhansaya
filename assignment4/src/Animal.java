public class Animal implements AnimalInterface{
    private String name = null;
    public String toStr(){
        return "Animal";
    }
    public void makeSound(){
        System.out.println("Sound");
    }
    public void printName() {
        System.out.println(name);
    }
    public void setName(String nameInput){
        name = nameInput;
    }
    public String getName(){
        return name;
    }
    Animal(String nameInput){
        name = nameInput;
    }
    Animal(){}
}
