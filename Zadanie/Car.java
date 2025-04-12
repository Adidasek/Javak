package Zadanie;

public class Car extends Vehicle implements LandTransport
{
public Car(String name, int speed){
        super(name,speed);
        
    }

    public void move(){
    System.out.println(name + " jezdzi po drodze z predkoscia " + speed );
    drive();
    }

    public void drive(){
        System.out.println(name + " jezdzi po drodze");
    
    }

    

}