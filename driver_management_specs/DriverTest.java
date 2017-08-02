import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest{

  Driver chuckNorris;
  DodgemCar mrSpeedy;
  QuadBike vroom4000;

  @Before
  public void before(){
    mrSpeedy = new DodgemCar( 10 );
    vroom4000 = new QuadBike( 40, 30 );
  }

  @Test
  public void testCanConstructWithNoRide(){
    chuckNorris = new Driver();
    assertEquals( null, chuckNorris.getRide() );
  }

  @Test
  public void testCanConstructWithRide(){
    chuckNorris = new Driver( mrSpeedy );
    assertEquals( mrSpeedy, chuckNorris.getRide() );
  }

  @Test 
  public void testCanChangeRide(){
    chuckNorris = new Driver( mrSpeedy );
    chuckNorris.setRide( vroom4000 );
    assertEquals( vroom4000, chuckNorris.getRide() );
  }

  @Test
  public void testDriveTimeReturnsTime(){
    chuckNorris = new Driver( mrSpeedy );
    assertEquals( 1, chuckNorris.driveTime( 10 ) );    
  }

}