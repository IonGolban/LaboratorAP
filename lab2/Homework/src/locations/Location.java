package locations;

import java.util.Objects;

/**
 * Class location is the parent class for all types of location from locations package. This class has three private members which represents the name
 * of location, x, y coordinates (assume that the locations are placed in a cartesian coordinate system) and the protected member "type"
 *  initialized in the constructor of child class.
 */
public class Location {

    private String name;
    private double geoX;
    private double geoY;
    protected String type;


    /**
     * The constructor of Location class this 3 params adn the names is equivalent to the private members in this class
     * @param name the name of location
     * @param geoX the x in cartesian coordinate
     * @param geoY the y in cartesian coordinate
     */
    public Location(String name, double geoX, double geoY) {
        this.name = name;
        this.geoX = geoX;
        this.geoY = geoY;
    }


    public String getCoordinates() {
        return "("+String.valueOf(this.geoX)+","+String.valueOf(this.geoY)+")";
    }


    public double getGeoX() {
        return geoX;
    }


    public double getGeoY() {
        return geoY;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "locationTypes.locations.Location{" +
                "name='" + name + '\'' +
                "coordinates=(" + geoX +","+ geoY+")"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;
        return Double.compare(location.geoX, geoX) == 0 &&
                Double.compare(location.geoY, geoY) == 0 &&
                Objects.equals(name, location.name) ;
    }


}
