package zadanie_2;
import javax.swing.*;

public class Zadanie1 {

     static void rownanie(int a,int x,int b ){
        int delta;

        delta=a*x+b;
       JOptionPane.showMessageDialog(null ," Wartość delta wynosi "+ delta);
     }
    public static void main(String[] args){
        int a,x,b;
        
        //podaj liczbe a
        String liczba_a = JOptionPane.showInputDialog("Podaj a = ");
        a = Integer.parseInt(liczba_a);
        //podaj liczbe b
        String liczba_x = JOptionPane.showInputDialog("Podaj x = ");
        x=Integer.parseInt(liczba_x);
        //podaj liczbe c
        String liczba_b = JOptionPane.showInputDialog("Podaj liczbe b = ");
        b=Integer.parseInt(liczba_b);

        rownanie(a,x,b);
        
    }
    
}
