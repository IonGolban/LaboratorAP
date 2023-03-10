import locations.Location;
import roads.Road;

import java.util.*;

/**
 * This class represents a map with locations and roads between locations. the locations nad roads can be added by methods.
 * The problem for which this class was created is to find the route between two valid locations through the roads.
 */
public class RouteProblem {
    private List<Location> locations;
    private List<Road> roads;

    /**
     * The constructor of RouteProblem class, which initialize the  empty list of roads and locations
     */
    RouteProblem(){
        locations= new ArrayList<>();
        roads = new ArrayList<>();
    }


    /**
     * The second constructor of RouteProblem class
     * @param locations the list of locations received as a parameter
     * @param roads the list of roads received as a parameter
     */
    RouteProblem(List<Location> locations,List<Road> roads){
        this.locations= locations;
        this.roads = roads;
    }


    /**
     * Method for adding the a location in locations list
     * @param location must not be in the existing list of locations
     */
    public void addLocation(Location location){
        if(!locations.contains(location)) locations.add(location);
    }

    /**
     * Method for adding the a road in roads list
     * @param road must not be in the existing list of roads
     */
    public void addRoad(Road road){
        if(!roads.contains(road)&&locations.contains(road.getLocation2())&&locations.contains(road.getLocation1())) roads.add(road);
    }


    /**
     * findRoute function  determine if exists a path between these 2 locations. The implementing algorithm is
     * BFS. It crosses the met places in turn by going through the list of roads to find the endlocation knowing
     * that we started from the startlocation.
     * @param startLocation must by in locations list. It has the meaning of current/start location.
     * @param endLocation must by in locations list. The function determine if there is a road to endLocation.
     * @return return true if exists a path between these 2 locations and false if does not exist.
     */
    public boolean findRoute(Location startLocation, Location endLocation){
        if(!locations.contains(startLocation)||!locations.contains(endLocation)) return false ;

        List<Location> visitedLocations = new ArrayList<>();
        Queue<Location> locationQueue = new LinkedList<>();
        locationQueue.add(startLocation);

        while(!locationQueue.isEmpty()){
            Location currentLocation = locationQueue.poll();
            if(currentLocation.equals(endLocation))return true;
            visitedLocations.add(currentLocation);
            for(Road road :roads) {
                if (!visitedLocations.contains(road.getLocation1()) && road.getLocation2().equals(currentLocation))
                    locationQueue.add(road.getLocation1());
                else if (!visitedLocations.contains(road.getLocation2()) && road.getLocation1().equals(currentLocation))
                    locationQueue.add(road.getLocation2());
            }
        }
        return false ;
    }

}
