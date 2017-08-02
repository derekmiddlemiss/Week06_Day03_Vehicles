package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private int numSeats = 2;

  public DodgemCar( int averageSpeed ) {
    super( averageSpeed );
  }

  public int driveTime( int distance ){
    return distance/this.averageSpeed;
  }

  public int getNumSeats(){
    return this.numSeats;
  }

}