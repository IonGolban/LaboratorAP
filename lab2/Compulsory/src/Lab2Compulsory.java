import enumTypes.LocationType;
import enumTypes.RoadType;

public class Lab2Compulsory {
    public static void main(String[] args) throws Exception {

        Location chisinau = new Location("Chisinau",99,100, LocationType.CITY);
        Location iasi = new Location("Iasi",7,12,LocationType.CITY);
        Location airportIasi = new Location("Iasi International Airport",15.5,25.5,LocationType.AIRPORT);
        Road e58 = new Road(100,90, RoadType.EXPRESS,chisinau,iasi);
        Road e25 = new Road(20,60,RoadType.COUNTRY,iasi,airportIasi);

        System.out.println(chisinau);
        System.out.println(iasi);
        System.out.println(airportIasi);
        System.out.println(e58);
        System.out.println(e25);
    }
}
