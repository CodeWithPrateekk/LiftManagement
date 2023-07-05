package com.example.LiftManagementSystems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LiftService {

    @Autowired
    LiftRepository liftRepository;

    public static String addLift(Lift lift) {
        return LiftRepository.addLift(lift);
}
    public static String addPassenger(Passenger passenger){
        return LiftRepository.addPassenger(passenger);
    }

    public static String deletePassenger() {

        return LiftRepository.deletePassenger();
    }

    public static int getMaxPassenger(int weight,int liftNo) {
        return LiftRepository.getMaxPassenger(weight,liftNo);
    }

    public static int getNumberOfPeople(int liftNo) {

        return LiftRepository.getNumberOfPeople(liftNo);
    }
}
