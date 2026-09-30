package prueba;

import java.time.LocalDate;

public class Aerial extends Robot implements ResistanceEvaluable{
    private final double maxAltitudMeters;
    private final int flightRangeMinuts;

    public Aerial(String name, String manufacturer, int manufacturYear, LocalDate registerDate, double maxAltitudMeters, int flightRangeMinuts) {
        super(name, manufacturer, manufacturYear, registerDate);
        this.maxAltitudMeters = maxAltitudMeters;
        this.flightRangeMinuts = flightRangeMinuts;
    }

    public double getMaxAltitudMeters() {
        return maxAltitudMeters;
    }

    public int getFlightRangeMinuts() {
        return flightRangeMinuts;
    }

    @Override
    public String getTechnicalDescription() {
        return getName()+ " flies up to "
                +maxAltitudMeters+ " m for "
                +flightRangeMinuts+ " minuts. Manufactured in "
                +getManufacturYear()+ " by "
                +getManufacturer()+ ".";
    }

    @Override
    public String toString() {
        return "Aerial{" +super.toString()+
                " maxAltitudMeters=" + maxAltitudMeters +
                ", flightRangeMinuts=" + flightRangeMinuts +
                '}';
    }

    @Override
    public String getResistanceReport() {
        if(flightRangeMinuts>= 60){
            return getName()+  " it's suitable for competition";
        }
        return getName()+ " is NOT suitable for competition";

    }
}
