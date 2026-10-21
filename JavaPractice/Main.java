class Main{
    public static void main(String[] args)
    {
    
        Car car =new Car("BMW", "Black", 5000000);
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
    }
}