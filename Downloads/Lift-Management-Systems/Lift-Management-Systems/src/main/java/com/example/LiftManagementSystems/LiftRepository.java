package com.example.LiftManagementSystems;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;


@Repository
public class LiftRepository {

    static HashMap<Integer,Lift> liftDb = new HashMap<>();

    static public HashMap<Integer, Passenger> passengerDb = new HashMap<>();

    public static String addLift(Lift lift) {
        liftDb.put(lift.getLiftNo(),lift);
        //

        return "Lift added successfully";

    }

    public static String addPassenger(Passenger passenger){
        passengerDb.put(passenger.getPassengerId(),passenger);

        return "Passenger added successfully";
    }

    public static String deletePassenger() {

        for(int key : passengerDb.keySet())
        {
            if(key < 5)
                passengerDb.remove(key);
        }

        return "All passengers whose ids are less than 5 is deleted successfully";


    }

    public static int getMaxPassenger(int weight,int liftNo) {

        int capacityWeightOfLift = liftDb.get(liftNo).getCapacityInWeight();

        if(weight > capacityWeightOfLift)
            return 0;

        int num = capacityWeightOfLift/weight;
        if(num > liftDb.get(liftNo).getCapacityInPerson())
            return liftDb.get(liftNo).getCapacityInPerson();
        else
            return num;

    }

    public static int getNumberOfPeople(int liftNo) {
        int count = 0;
        ArrayList<Passenger> passengers = liftDb.get(liftNo).getPassengerList();

        for(Passenger p : passengers){
            if(p.getWeight() > 50){
                count ++;
            }
        }

        return count;

    }
}
