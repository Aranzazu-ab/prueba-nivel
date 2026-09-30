package prueba;

import java.time.LocalDate;

public class Main {
 public static void main (String[] args){
     RobotManager manager = new RobotManager();

     manager.registerRobot(new Terrestrial("Terrestrial1", "Manu1", 2020, LocalDate.of(2024, 1,1), 200, Terrestrial.Track.CATERPILLAR));
     manager.registerRobot(new Acuatic("Acuatic1", "Manu2", 2020, LocalDate.of(2024, 1,1),50, Acuatic.Propulsion.JET));
     manager.registerRobot(new Aerial("Aerial1", "Manu3", 2020, LocalDate.of(2024, 1,1), 1000, 5));
     manager.registerRobot(new Terrestrial("Terrestrial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 201, Terrestrial.Track.CATERPILLAR));
     manager.registerRobot(new Acuatic("Acuatic2", "Manu1", 2020, LocalDate.of(2024, 1,1), 100, Acuatic.Propulsion.PROPELLER));
     manager.registerRobot(new Aerial("Aerial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 2000,1000));


     System.out.println(manager.listAllRobotsDescriptions());
     System.out.println(manager.listTerrestrialWithMoreThanGivenSpeed(200));
     System.out.println(manager.listRobotsByManufacturer("Manu1"));

     new ResistanceReportPrinter().printReport(manager.getEvaluables());




 }
}
