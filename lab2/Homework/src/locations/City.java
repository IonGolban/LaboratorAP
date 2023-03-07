package locations;

import roads.Road;

public class City extends Location {

    private long population ;

    public City(String name, double geoX, double geoY, long population) {
        super(name, geoX, geoY);
        this.type ="city";
        this.population = population;
    }
}
