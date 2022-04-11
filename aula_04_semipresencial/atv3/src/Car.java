public class Car {
    private String licensePlate;
    private String model;
    private String color;

    public Car(){}

    public Car(String licensePlate, String model, String color) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return licensePlate;
    }
}
