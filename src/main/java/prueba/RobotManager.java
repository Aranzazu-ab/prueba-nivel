package prueba;

import java.util.ArrayList;
import java.util.List;

public class RobotManager {
    private final List<Robot> robotsList = new ArrayList<>();

    public void registerRobot(Robot robot){
        robotsList.add(robot);
    }

    public List<String> listAllRobotsDescriptions (){
        return robotsList.stream()
                .map(Robot::getTechnicalDescription)
                .toList();
    }

    public List<Terrestrial> listTerrestrialWithMoreThanGivenSpeed (double limitSpeed){
        return robotsList.stream()
                .filter(Terrestrial.class::isInstance)
                .map(Terrestrial.class::cast)
                .filter(r-> r.getMaxSpeedKmH() > limitSpeed)
                .toList();
    }

    public List<Robot> listRobotsByManufacturer (String manufacturer){
        return robotsList.stream()
                .filter(robot -> robot.getManufacturer().equalsIgnoreCase(manufacturer))
                .toList();
    }

    public List<ResistanceEvaluable> getEvaluables() {
        return robotsList.stream()
                .filter(ResistanceEvaluable.class::isInstance)
                .map(ResistanceEvaluable.class::cast)
                .toList();
    }
}
