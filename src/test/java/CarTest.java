import VehicleExercise.Car;
import VehicleExercise.Vehicle;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarTest.class);

    private Vehicle testVehicle;

    @BeforeClass
    public static void carTestSetup(){
        LOGGER.info("Before all tests");
    }

    @Before
    public void setTestVehicle(){
        LOGGER.info("Before each test");
        testVehicle = new Car(180);
    }

    @Test
    public void maxSpeedIsReachable(){
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for (int i = startSpeed; i < maxSpeed; i++) {
            testVehicle.increaseSpeed();
        }
        assertEquals(maxSpeed,testVehicle.getCurrentSpeed());
        assertTrue(maxSpeed == 180);
    }


    @Test (expected = Vehicle.VehicleCrashException.class)
    public void maxSpeedCannotBeExceded(){
        testVehicle.setSpeed(180);
        testVehicle.increaseSpeed();
    }

    @After
    public void testCleanUp(){
        LOGGER.info("After each test");
    }
    @AfterClass
    public static void finalizeTestingProgram(){
        LOGGER.info("Finalizing program");
    }



}
