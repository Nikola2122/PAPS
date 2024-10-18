class Vehicle implements display {
    private String producer;

    Vehicle(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void display() {
        System.out.println("INTERFACE DISPLAY");
    }

    @Override
    public String toString() {
        return "Poducer: " + producer;
    }
}
class Car extends Vehicle {
    private int doors;

    Car(String producer, int doors) {
        super(producer);
        this.doors = doors;
    }

    int getDoors() {
        return doors;
    }

    void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public String toString() {
        return super.toString() + " Doors: " + doors;
    }
}

class Bike extends Vehicle {
    private int gears;

    public Bike(String producer, int gears) {
        super(producer);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return super.toString() + " Gears: " + gears;
    }
}
interface display {
    public void display();
}

class Generic<E> {
    private E value;

    public Generic() {

    }

    public Generic(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "This is the value " + value.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 3);
        Bike b1 = new Bike("NRG", 10);
        Generic<Vehicle> v1 = new Generic<Vehicle>(c1);
        System.out.println(v1);
        Generic<Bike> b2 = new Generic<Bike>(b1);
        System.out.println(b2);
        Generic<Vehicle>[] niza = new Generic[10];
        niza[0] = new Generic<Vehicle>(c1);
        niza[1] = new Generic<Vehicle>(b1);
        System.out.println(niza[0]);
        System.out.println(niza[1]);
    }
}



