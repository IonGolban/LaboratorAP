package locations;

public class Airport extends Location {

    private int numberOfTerminals;

    public Airport(String name, double geoX, double geoY, int numberOfTerminals) {
        super(name, geoX, geoY);
        this.type = "airport";
        this.numberOfTerminals = numberOfTerminals;
    }


}
