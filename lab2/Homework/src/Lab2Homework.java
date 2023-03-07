import locations.Airport;
import locations.City;
import locations.Location;
import roads.Road;

public class Lab2Homework {
    public static void main(String[] args) throws Exception {

        Location chisinau = new City("Chisinau",99,100,500_000);
        Location chisinau1= new City("Chisinau",99,100,500_000);
        Location iasi = new City("Iasi",7,12,600_000);
        Location airportIasi = new Airport("Iasi International locationTypes.Airport",15.5,25.5,10);
        Road e58 = new Road(100,90,chisinau,iasi);
        Road e25 = new Road(10,60,iasi,airportIasi);

        RouteProblem routeProblem = new RouteProblem();
        routeProblem.addLocation(iasi);
        routeProblem.addLocation(chisinau);
        routeProblem.addLocation(airportIasi);
        routeProblem.addRoad(e25);
        routeProblem.addRoad(e58);

        if(routeProblem.findRoute(chisinau,iasi))System.out.println("The route is found.");
        else System.out.println("The route is not found.");
    }
}
