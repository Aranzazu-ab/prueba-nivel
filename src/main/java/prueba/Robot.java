package prueba;

import java.time.LocalDate;

public abstract class Robot {
    private final String name;
    private final String manufacturer;
    private final int manufacturYear;
    private final LocalDate registerDate;

    public Robot(String name, String manufacturer, int manufacturYear, LocalDate registerDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturYear = manufacturYear;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturYear() {
        return manufacturYear;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public abstract String getTechnicalDescription();

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturYear=" + manufacturYear +
                ", registerDate=" + registerDate +
                '}';
    }
}
