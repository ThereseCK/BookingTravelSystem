package therese_get;

import java.util.Scanner;

public class Departures {

    public int DepartureId;

    public double DepartureTime;

    public double TravelDistance;

    public double TravelTime;

    protected Departures(int departureId, double departureTime, double travelDistance, double travelTime) {
        DepartureId = departureId;
        DepartureTime = departureTime;
        TravelDistance = travelDistance;
        TravelTime = travelTime;

    }

    public String Print() {
        return " \n" + "Id: " + DepartureId + " Tid: " + DepartureTime + " Km: " + TravelDistance + " Reisen tar: " + TravelTime;
    }


}
