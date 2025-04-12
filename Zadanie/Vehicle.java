package Zadanie;

public abstract class Vehicle{
    protected String name;
    protected double speed;
 
    public Vehicle(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }

    //abstrakcyjna metoda która musi być zaimplementowana przez klasy dziedziczone
    
    public abstract void move();

    public String getName(){
        return name;
    }

    public double getSpeed(){
        return speed;
    }
}





