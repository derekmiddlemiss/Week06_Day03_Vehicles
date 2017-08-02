import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest{

  QuadBike bike;

  @Before
  public void before(){
    bike = new QuadBike( 20, 40 );
  }

  @Test
  public void driveTimeReturnsTime(){
    assertEquals( 1, bike.driveTime( 20 ) );
  }

  @Test
  public void checkEngineCapacity(){
    assertEquals( 40, bike.getEngineCapacity() );
  }

}