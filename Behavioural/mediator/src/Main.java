public class Main {
    public static void main(String[] args) {
        AirportControlTower airportControlTower = new AirportControlTower();
        Airplane airplane = new CommercialAirplane(airportControlTower);
        airplane.requestTakeOff();
        airplane.requestLanding();
    }
}