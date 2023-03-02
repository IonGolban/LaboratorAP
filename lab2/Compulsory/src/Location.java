import enumTypes.LocationType;

public class Location {
    private String name;
    private double geoX;
    private double geoY;
    private LocationType locationType;

    public Location(String name, double geoX, double geoY, LocationType locationType) {
        this.name = name;
        this.geoX = geoX;
        this.geoY = geoY;
        this.locationType = locationType;
    }

    public String getCoordinates() {
        return "("+String.valueOf(this.geoX)+","+String.valueOf(this.geoY)+")";
    }

    public void setCoordinates(double geoX,double geoY) {
        this.geoX = geoX;
        this.geoY = geoY;
    }

    public double getGeoX() {
        return geoX;
    }

    public void setGeoX(double geoX) {
        this.geoX = geoX;
    }

    public double getGeoY() {
        return geoY;
    }

    public void setGeoY(double geoY) {
        this.geoY = geoY;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                "coordinates=(" + geoX +","+ geoY+")"+
                ", location type=" + locationType +
                '}';
    }
}
