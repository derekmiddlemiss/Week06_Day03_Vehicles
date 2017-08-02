import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest{

  DodgemCar car;

  @Before
  public void before() {
    car = new DodgemCar();
  }

  @Test
  public void driveDistanceReturnsTime(){
    assertEquals( 100, car.driveDistance() );
  }

}