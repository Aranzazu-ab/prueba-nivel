package prueba;

import java.util.List;

public class RobotManager {
    private final RobotLogger robotsLogged;

    public RobotManager(RobotLogger robotsLogged) {
        this.robotsLogged = robotsLogged;
    }

    public List<String> listAllRobotsDescriptions (){
        return robotsLogged.stream()
                .map(Robot::getTechnicalDescription)
                .toList();
    }

    public List<Terrestrial> listTerrestrialWithMoreThanGivenSpeed (double limitSpeed){
        return robotsLogged.stream()
                .filter(Terrestrial.class::isInstance)
                .map(Terrestrial.class::cast)
                .filter(r-> r.getMaxSpeedKmH() > limitSpeed)
                .toList();
    }

    public List<Robot> listRobotsByManufacturer (String manufacturer){
        return robotsLogged.stream()
                .filter(robot -> robot.getManufacturer().equalsIgnoreCase(manufacturer))
                .toList();
    }

    public void printAnyList (List<?> list){
        list.forEach(System.out::println);
    }

    public List<ResistanceEvaluable> getEvaluables() {
        return robotsLogged.stream()
                .filter(ResistanceEvaluable.class::isInstance)
                .map(ResistanceEvaluable.class::cast)
                .toList();
    }

}
