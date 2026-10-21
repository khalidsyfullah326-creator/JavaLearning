// GroupA/Truck.java
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        System.out.println("Truck - Brand: " + brand + ", Speed: " + speed
                + ", Load Capacity: " + loadCapacity + " tons");
    }
}