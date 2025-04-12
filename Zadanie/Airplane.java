package Zadanie;

public class Airplane extends Vehicle implements AirTransport
{
public Airplane(String name, int speed){
        super(name,speed);
        
    }

    @Override
    public void move(){
        System.out.println(name + " lata z predkoscia " + speed );
        fly();
    }

    @Override
    public void fly(){
        System.out.println(name + " lata w powietrzu");
    
    }

    

}