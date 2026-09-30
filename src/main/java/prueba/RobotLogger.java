package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RobotLogger {
    List<Robot> robotsList = new ArrayList<>();

    public void logRobot (Robot robot){
        robotsList.add(robot);
    }

    public Stream<Robot> stream(){
        return robotsList.stream();
    }





}
