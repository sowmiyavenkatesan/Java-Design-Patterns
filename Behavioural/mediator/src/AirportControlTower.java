public class AirportControlTower implements AirControlTower {
    @Override
    public void requestTakeOff(Airplane airplane)
    {
        airplane.notifyAirTrafficControl("Requesting Take Off..");
    }

    @Override
    public void requestLanding(Airplane airplane)
    {
        airplane.notifyAirTrafficControl("Requesting Landing..");
    }
}