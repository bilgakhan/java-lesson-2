public class Car {
    private String color;
    private String model;
    private int price;
    private boolean isAvto;

    public Car(String color, String model, int price, boolean isAvto) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isAvto = isAvto;
    }

    public String getInfo() {
        String tizim = isAvto ? "Avtomatik" : "Mexanik";
        return "Model: " + model + "\nColor: " + color + "\nPrice: " + price + "\nTransmission: " + tizim;
    }
}