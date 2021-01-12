package model;

public class Vehicle extends MagicGenerator{

    public Vehicle() {
    }

private String color;
private String owner;
private String manufacturer;
private String model;
private String licensePlate;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

  /**  public String getModel() {
        return model;
    }

    //public void setModel(String model) {
        this.model = model;
    }
**/
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getRandomColor());
        sb.append("\n");
        sb.append(getRandomColor());
        sb.append("\n");
        sb.append(getRandomColor());
        sb.append("\n");
        sb.append(getRandomColor());
        sb.append("\n");sb.append("\n");

        String s = new String(sb);
        return s;

    }
}
