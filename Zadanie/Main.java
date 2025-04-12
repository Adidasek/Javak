package Zadanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    
 

    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();

        //dodawanie obiektów różnych typów boat car airplane
        vehicles.add(new Car("Toyota", 20));
        vehicles.add(new Boat("Jumper", 102));
        vehicles.add(new Airplane("rolls", 50000));

        System.out.println("Testowanie");
        for(Vehicle vehicle : vehicles){
            vehicle.move();
        }


    }

}