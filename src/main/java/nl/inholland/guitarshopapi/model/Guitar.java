package nl.inholland.guitarshopapi.model;

import java.util.UUID;

public class Guitar {
    private UUID uuid;
    private String brand;
    private String model;
    private double price;

    public Guitar() {}

    public Guitar(String brand, String model, double price) {
        this.uuid = UUID.randomUUID();
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Guitar{");
        sb.append("uuid=").append(uuid);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
