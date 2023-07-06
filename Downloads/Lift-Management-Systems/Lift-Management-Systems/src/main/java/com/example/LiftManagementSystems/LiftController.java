package com.example.LiftManagementSystems;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lift")
public class LiftController {

    @Autowired
    LiftService liftService;


    @PostMapping("/add-Lift")
    public static String addLift(@RequestBody Lift lift){
        return LiftService.addLift(lift);
    }

    @PostMapping("/add-Passenger")
    public static String addPassenger(@RequestBody Passenger passenger){
        return LiftService.addPassenger(passenger);
    }

    @DeleteMapping("/delete-with-ids-less-than-5")
    public String deletePassenger(){
        return LiftService.deletePassenger();
    }
    @GetMapping("/get-people-having-weight-x-that-can-travel-in-a-given-lift/{weight}/{liftNo}")
    public int getMaxPassenger(@PathVariable int weight, @PathVariable int liftNo){
        return LiftService.getMaxPassenger(weight,liftNo);
    }

    @GetMapping("/get-number-of-people/{LiftNo}")
    public int getNumberOfPeople(@PathVariable int liftNo){
        return LiftService.getNumberOfPeople(liftNo);
    }

}
