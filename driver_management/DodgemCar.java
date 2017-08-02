package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  private int averageSpeed;
  private int numSeats = 2;

  public DodgemCar( int averageSpeed ) {
    this.averageSpeed = averageSpeed;
  }

  public int driveTime( int distance ){
    return distance/this.averageSpeed;
  }



}