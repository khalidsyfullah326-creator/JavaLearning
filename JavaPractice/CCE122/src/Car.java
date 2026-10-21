// GroupA/Car.java
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void display() {
        System.out.println("Car - Brand: " + brand + ", Speed: " + speed
                + ", Doors: " + doors);
    }
}