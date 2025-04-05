package CW3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Javax {

   

     static void mine(ArrayList<Integer> n)
    {
        System.out.println("Sieaaama");
        
    }

    

     public static void main(String[] args)
    {   ArrayList <Integer> liczby = new ArrayList<>();
         
            liczby.add(1);
            liczby.add(5);
            liczby.add(3);
            
            mine(liczby);
            pentla(liczby);
        
    }
    static void pentla(ArrayList<Integer> b)
    {
        for (int liczby : b) {
            System.out.println(liczby);
        }
    }
    
}
