package com.example.LiftManagementSystems;

import java.util.ArrayList;

public class Lift {

    private int liftNo;
    private int capacityInWeight;
    private int capacityInPerson;

    private ArrayList<Passenger> passengerList;

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, ArrayList<Passenger> passengerList) {
        this.liftNo = liftNo;
        this.capacityInWeight = capacityInWeight;
        this.capacityInPerson = capacityInPerson;
        this.passengerList = passengerList;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return capacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        this.capacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return capacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        this.capacityInPerson = capacityInPerson;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
