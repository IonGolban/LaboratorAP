import locations.Airport;
import locations.City;
import locations.GasStation;
import locations.Location;
import roads.CountryRoad;
import roads.ExpressRoad;
import roads.Road;

import java.util.Map;

public class Lab2Bonus {
    public static void main(String[] args) throws Exception {

        Location chisinau = new City("Chisinau",99,100,500_000);
        Location bemol= new GasStation("Bemol",80,15,50);
        Location iasi = new City("Iasi",7,12,600_000);
        Location airportIasi = new Airport("Iasi International locationTypes.Airport",15.5,25.5,10);
        Road e58 = new ExpressRoad(110,90,chisinau,iasi);
        Road e25 = new CountryRoad(10,60,iasi,airportIasi);
        Road e26 = new ExpressRoad(100,60,chisinau,bemol);
        Road e27 = new CountryRoad(1,60,airportIasi,bemol);

        RouteProblem routeProblem = new RouteProblem();
        routeProblem.addLocation(iasi);
        routeProblem.addLocation(chisinau);
        routeProblem.addLocation(airportIasi);
        routeProblem.addLocation(bemol);
        routeProblem.addRoad(e58);
        routeProblem.addRoad(e25);
        routeProblem.addRoad(e26);
        routeProblem.addRoad(e27);

        routeProblem.findBestRoute(airportIasi,chisinau).forEach(location -> System.out.println(location));

    }
}
