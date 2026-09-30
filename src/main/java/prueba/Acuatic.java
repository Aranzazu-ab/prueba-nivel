package prueba;

import java.time.LocalDate;

public class Acuatic extends Robot{
    private final double maxDeepMeter;
    private final Propulsion typePropulsion;

    public enum Propulsion {JET, PROPELLER };

    public Acuatic(String name, String manufacturer, int manufacturYear, LocalDate registerDate, double maxDeepMeter, Propulsion typePropulsion) {
        super(name, manufacturer, manufacturYear, registerDate);
        this.maxDeepMeter = maxDeepMeter;
        this.typePropulsion = typePropulsion;
    }

    public double getMaxDeepMeter() {
        return maxDeepMeter;
    }

    public Propulsion getTypePropulsion() {
        return typePropulsion;
    }

    @Override
    public String getTechnicalDescription() {
        return getName()+" reaches a depth of "
                +maxDeepMeter+ "m with a "
                +typePropulsion+ " propulsion. Manufactured by "
                +getManufacturer()+ " in "
                +getManufacturYear()+".";
    }

    @Override
    public String toString() {
        return "Acuatic{" + super.toString()+
                " maxDeepMeter=" + maxDeepMeter +
                ", typePropulsion=" + typePropulsion +
                '}';
    }
}
