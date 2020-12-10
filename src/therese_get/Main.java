package therese_get;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		ArrayList<String> mineTravels = new ArrayList<>();
    	String info = new Travels().Info();
		System.out.println(info);
		byte input = new Travels().scan();

		ArrayList<String> BusList = new ArrayList<>();
    	var bus1 = new Bus(1, 12.45, 52.2, 1.52).Print();
    	var bus2 = new Bus(2, 13.45, 52.2, 1.52).Print();
    	var bus3 = new Bus(3, 14.45, 52.2, 1.52).Print();
    	BusList.add(bus1);
    	BusList.add(bus2);
    	BusList.add(bus3);

		ArrayList<String> TrainList = new ArrayList<>();
		var train1 = new Train(1,06.40,14450.2,3.52).Print();
		var train2 = new Train(2,18.15,52222.2,5.52).Print();
		var train3 = new Train(3,20.05,1554.2,1.52).Print();
		TrainList.add(train1);
		TrainList.add(train2);
		TrainList.add(train3);

		ArrayList<String> FlightList = new ArrayList<>();
		var flight1 = new Flight(1,06.40,14450.2,3.52).Print();
		var flight2 = new Flight(2,18.15,52222.2,5.52).Print();
		var flight3 = new Flight(3,20.05,1554.2,1.52).Print();
		FlightList.add(flight1);
		FlightList.add(flight2);
		FlightList.add(flight3);


		if(input == 1) {
			System.out.println("liste over busser: " + " \n" + BusList);
			Scanner bookBus = new Scanner(System.in);
			byte inputBus = bookBus.nextByte();

			if(inputBus == 1) {
				System.out.println("du har booket plass på buss" + bus1);
				mineTravels.add(bus1);
				System.out.println(info);


			}
			if(inputBus == 2) {
				System.out.println("du har booket plass på buss " + bus2);
				mineTravels.add(bus2);
				System.out.println(info);

			}
			if(inputBus == 3) {
				System.out.println("du har booket plass på buss" + bus3);
				mineTravels.add(bus3);
				System.out.println(info);


			}
			}
		if(input == 2){
			System.out.println("liste over Tog: " +" \n" + TrainList);
			Scanner bookTrain = new Scanner(System.in);
			byte inputTrain = bookTrain.nextByte();

			if(inputTrain == 1) {
				System.out.println("du har booket plass på tog" + train1);
				mineTravels.add(train1);
				System.out.println(info);

			}
			if(inputTrain == 2) {
				System.out.println("du har booket plass på tog " + train2);

				mineTravels.add(train2);
				System.out.println(info);

			}
			if(inputTrain == 3) {
				System.out.println("du har booket plass på tog" + train3);
				mineTravels.add(train3);
				System.out.println(info);


			}
		}

		if(input == 3) {

			System.out.println("liste over fly: " +" \n" + FlightList);
			Scanner bookFlight = new Scanner(System.in);
			byte inputFlight = bookFlight.nextByte();

			if(inputFlight == 1) {
				System.out.println("du har booket plass på tog" + flight1);
				mineTravels.add(flight1);
				System.out.println(info);

			}
			if(inputFlight == 2) {
				System.out.println("du har booket plass på tog " + flight2);
				mineTravels.add(flight2);
				System.out.println(info);

			}
			if(inputFlight == 3) {
				System.out.println("du har booket plass på tog" + flight3);
				mineTravels.add(flight3);
				System.out.println(info);
			}
		}
		byte inputny = new Travels().scan();
		if(inputny == 4){
			for ( var tur : mineTravels){
				System.out.println(tur);
			}
			//System.out.println("mine bookinger " + mineTravels);
			System.out.println(info);
		}
    }

}
