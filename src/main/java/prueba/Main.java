package prueba;

import java.time.LocalDate;

public class Main {
 public static void main (String[] args){
     RobotLogger logger = new RobotLogger();
     RobotManager manager = new RobotManager(logger);

     logger.logRobot(new Terrestrial("Terrestrial1", "Manu1", 2020, LocalDate.of(2024, 1,1), 200, Terrestrial.Track.CATERPILLAR));
     logger.logRobot(new Acuatic("Acuatic1", "Manu2", 2020, LocalDate.of(2024, 1,1),50, Acuatic.Propulsion.JET));
     logger.logRobot(new Aerial("Aerial1", "Manu3", 2020, LocalDate.of(2024, 1,1), 1000, 5));
     logger.logRobot(new Terrestrial("Terrestrial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 201, Terrestrial.Track.CATERPILLAR));
     logger.logRobot(new Acuatic("Acuatic2", "Manu1", 2020, LocalDate.of(2024, 1,1), 100, Acuatic.Propulsion.PROPELLER));
     logger.logRobot(new Aerial("Aerial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 2000,1000));

     manager.printAnyList(manager.listAllRobotsDescriptions());

     manager.printAnyList(manager.listTerrestrialWithMoreThanGivenSpeed(200));

     manager.printAnyList(manager.listRobotsByManufacturer("Manu1"));

     new ResistanceReportPrinter().printReport(manager.getEvaluables());




 }
}
