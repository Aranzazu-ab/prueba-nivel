package prueba;

import java.time.LocalDate;

public class Terrestrial extends Robot implements ResistanceEvaluable{
    private final double maxSpeedKmH;
    private final Track trackType;



    public enum Track {WHEELS, CATERPILLAR};

    public Terrestrial(String name, String manufacturer, int manufacturYear, LocalDate registerDate, double maxSpeedKmH, Track trackType) {
        super(name, manufacturer, manufacturYear, registerDate);
        this.maxSpeedKmH = maxSpeedKmH;
        this.trackType = trackType;
    }

    public double getMaxSpeedKmH() {
        return maxSpeedKmH;
    }

    public Track getTrackType() {
        return trackType;
    }

    @Override
    public String getTechnicalDescription() {
        return getName()+ ", manufactured by "
                +getManufacturer()+ " in "
                +getManufacturYear()+", with "
                +trackType+" track and reaches to "
                +maxSpeedKmH+ " km/h.";
    }

    @Override
    public String toString() {
        return "Terrestrial{" +super.toString()+
                " maxSpeedKmH=" + maxSpeedKmH +
                ", trackType=" + trackType +
                '}';
    }

    @Override
    public String getResistanceReport() {
        if(trackType == Track.CATERPILLAR){
            return getName()+  "it's suitable for competition";
        }
        return getName()+ " is NOT suitable for competition";

    }
}
