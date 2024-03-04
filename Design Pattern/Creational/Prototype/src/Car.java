public class Car implements Prototype{
    private String model;
    private String brand;
    private String color;
    private int topSpeed;
    public Car () {}

    public Car(Car car) {
        this.model = car.model;
        this.brand = car.brand;
        this.color = car.color;
        this.topSpeed = car.topSpeed;
    }
    @Override
    public Car clone() {
        return new Car(this);
    }
}
