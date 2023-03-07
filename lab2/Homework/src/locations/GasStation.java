package locations;

public class GasStation extends Location {

    private double gasPrice ;

    public GasStation(String name, double geoX, double geoY,double gasPrice) {
        super(name, geoX, geoY);
        this.type = "gasStation";
    }
}
