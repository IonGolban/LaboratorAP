import enumTypes.RoadType;

public class Road {

    private int  length ;
    private int speedLimit;
    private RoadType roadType;
    private Location location1 ;
    private Location location2 ;


    public Road(int length, int speedLimit, RoadType roadType,Location location1,Location location2) throws Exception{

        double euclideanDistance = Math.sqrt(
                Math.pow(2,(Math.abs(location1.getGeoX()-location2.getGeoX()))) +
                        Math.pow(2,(Math.abs(location1.getGeoY()-location2.getGeoY())))
        );

        if(euclideanDistance<length)throw new Exception("The length between the "+location1.getName()+" and "+ location2.getName()+" is not correct !");

        this.length = length;
        this.speedLimit = speedLimit;
        this.roadType = roadType;
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

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    @Override
    public String toString() {
        return "Road{" +
                "between "+location1.getName()+" and "+location2.getName()+
                ", length=" + length +
                ", speedLimit=" + speedLimit +
                ", roadType=" + roadType +
                '}';
    }

}
