import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prueba.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotManagerTest {
    private RobotManager manager;
    private Robot terrestrial1;
    private Robot terrestrial2;
    private Robot aerial1;
    private Robot aerial2;
    private Robot acuatic1;
    private Robot acuatic2;

    @BeforeEach
    void setTest () {
        manager = new RobotManager();
        terrestrial1=(new Terrestrial("Terrestrial1", "Manu1", 2020, LocalDate.of(2024, 1,1), 200, Terrestrial.Track.CATERPILLAR));
        terrestrial2=(new Terrestrial("Terrestrial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 201, Terrestrial.Track.CATERPILLAR));
        acuatic1 = (new Acuatic("Acuatic1", "Manu2", 2020, LocalDate.of(2024, 1,1),50, Acuatic.Propulsion.JET));
        acuatic2=(new Acuatic("Acuatic2", "Manu1", 2020, LocalDate.of(2024, 1,1), 100, Acuatic.Propulsion.PROPELLER));
        aerial1=(new Aerial("Aerial1", "Manu3", 2020, LocalDate.of(2024, 1,1), 1000, 8));
        aerial2=(new Aerial("Aerial2", "Manu1", 2020, LocalDate.of(2024, 1,1), 2000,1000));

        manager.registerRobot(terrestrial1);
        manager.registerRobot(terrestrial2);
        manager.registerRobot(acuatic1);
        manager.registerRobot(acuatic2);
        manager.registerRobot(aerial1);
        manager.registerRobot(aerial2);
    }

    @Test
    void listRobotDescriptionReturnsCorrectList (){
        assertEquals(6,manager.listAllRobotsDescriptions().size());
    }

    @Test
    void listTerrestrialWithMoreThanGivenSpeedReturnsCorrectList(){
        List<Terrestrial> result = manager.listTerrestrialWithMoreThanGivenSpeed(200.0);

        assertEquals(1, result.size());
    }

    @Test
    void listRobotsByManufacturerReturnsCorrectList () {
    assertEquals(4, manager.listRobotsByManufacturer("Manu1").size());
    }

    @Test
    void getEvaluablesReturnCorrectList(){
        List<ResistanceEvaluable> result = manager.getEvaluables();

        assertEquals(List.of(terrestrial1, terrestrial2,aerial1,aerial2), result);

    }

}
