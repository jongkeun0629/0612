class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("이름 : " + name);
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName(){
        System.out.printf("이름 : %s, 종 : %s", name, breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("삐삐");
        Animal dog = new Dog("마루쉐", "그레이 하운드");

        animal.printName();
        dog.printName();
    }
}