package driver_management;
import behaviours.*;

public class Driver{

  private Driveable ride;

  public Driver( Driveable ride ){
    this.ride = ride;
  }

  public Driver(){}

  public int driveTime( int distance ){
    return ride.driveTime( distance );
  }

  public Driveable getRide(){
    return this.ride;
  }

  public void setRide( Driveable ride ){
    this.ride = ride;
  }

}