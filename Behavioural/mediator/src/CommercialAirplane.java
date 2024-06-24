public class CommercialAirplane implements Airplane{
    AirportControlTower airportControlTower;

    CommercialAirplane(AirportControlTower airportControlTower)
    {
        this.airportControlTower = airportControlTower;
    }
    @Override
    public void requestTakeOff()
    {
        airportControlTower.requestTakeOff(this);
    }

    @Override
    public void requestLanding()
    {
        airportControlTower.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message)
    {
        System.out.println("Message receiving from AirPortControlTower: "+ message);
    }
}