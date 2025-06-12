class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void display() {
        System.out.println("Brand name: " + brand);
    }
}

class Car extends Vehicle{
    String model;

    public Car(String brand, String model){
        super(brand);
        this.model = model;
    }

    public void display(){
        System.out.printf("Brand name : %s, model name : %s\n", brand, model);
    }
}

class Car2 extends Car{
    public Car2(String model){
        super("BMW", model);
    }
}

class Motorcycle extends Vehicle{
    String model;

    public Motorcycle(String brand, String model){
        super(brand);
        this.model = model;
    }

    public void display(){
        System.out.printf("Brand name : %s, model name : %s\n", brand, model);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Hyundai", "genesis");
        Motorcycle moto = new Motorcycle("Yamaha", "R3");
        Car car2 = new Car2( "3");

        car.display();
        moto.display();
        car2.display();
    }
}