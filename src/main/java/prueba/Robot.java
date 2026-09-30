package prueba;

import java.time.LocalDate;

public abstract class Robot {
    private String name;
    private String manufacturer;
    private int manufacturYear;
    private LocalDate registerDate;

    public Robot(String name, String manufacturer, int manufacturYear, LocalDate registerDate) {
//        ValidatorUtils.validateString(name);
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
