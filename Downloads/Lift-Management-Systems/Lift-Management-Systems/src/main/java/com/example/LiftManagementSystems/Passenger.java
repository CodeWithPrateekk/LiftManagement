package com.example.LiftManagementSystems;

public class Passenger {

    private int passengerId;

    private int weight;

    private int lift;

    public Passenger(int passengerId, int weight, int lift) {
        this.passengerId = passengerId;
        this.weight = weight;
        this.lift = lift;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }
}
