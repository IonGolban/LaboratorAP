package roads;

import locations.Location;

import java.util.Objects;

/**
 * The Road is the parent class for all types of roads from package=src/roads . This class represent the the path from one location
 * to another. He has 4 private members which describe : "length" which must be  less than the euclidean distance between the location coordinates.
 * "speed limit" and  these 2 locations between which there is this road .
 */
public class Road {

    private int  length ;
    private int speedLimit;
    private Location location1 ;
    private Location location2 ;


    /**
     * The constructor of Road class which has 4 parameters
     * @param length should not be less than the euclidean distance between the location coordinates.
     * @throws Exception if the length param is less than the euclidean distance and if the locations param are the same .
     * @param location1 specify the start/end location.
     * @param location2 specify the start/end location.
     */
    public Road(int length, int speedLimit, Location location1, Location location2) throws Exception{
        if(location1.equals(location2)) throw new Exception("The "+location1.getName()+" and "+location2.getName()+" are the same.");
        double euclideanDistance = Math.sqrt(
                Math.pow(2,(Math.abs(location1.getGeoX()-location2.getGeoX()))) +
                        Math.pow(2,(Math.abs(location1.getGeoY()-location2.getGeoY())))
        );

        if(euclideanDistance<length)throw new Exception("The length between the "+location1.getName()+" and "+ location2.getName()+" is not correct !");

        this.length = length;
        this.speedLimit = speedLimit;
        this.location1 = location1;
        this.location2 = location2;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) throws Exception {
        double euclideanDistance = Math.sqrt(
                Math.pow(2,(Math.abs(location1.getGeoX()-location2.getGeoX())))+
                        Math.pow(2,(Math.abs(location1.getGeoY()-location2.getGeoY())))
        );

        if(euclideanDistance<length)throw new Exception("The length between the "+location1.getName()+" and "+ location2.getName()+" is not correct !");
        this.length = length;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "roadTypes.roads.Road{" +
                "between "+location1.getName()+" and "+location2.getName()+
                ", length=" + length +
                ", speedLimit=" + speedLimit +
                '}';
    }

    public Location getLocation1() {
        return location1;
    }

    public Location getLocation2() {
        return location2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return length == road.length &&
                speedLimit == road.speedLimit &&
                location1.equals(road.location1)  &&
                location2.equals(road.location2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, speedLimit, location1, location2);
    }
}
