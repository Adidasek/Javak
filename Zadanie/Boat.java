package Zadanie;

public class Boat extends Vehicle implements WaterTransport
{
public Boat(String name, int speed){
        super(name,speed);
        
    }

    @Override
    public void move(){
    System.out.println(name + " plywa po wodzie z predkoscia " + speed );
    sail();
    }

    @Override
    public void sail(){
        System.out.println(name + " plywa po wodzie");
    
    }

    

}