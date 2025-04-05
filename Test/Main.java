package Test;
 class Zadanie{
    int numer=0;
}

public class Main {

    public static void main(String[] args)
    {
        Zadanie test = new Zadanie();
        System.out.println(test.numer);
        add(test);
        System.out.println("  .  "+test.numer);

    }
     static void add(Zadanie test){
     test.numer=test.numer+100; 
     }
}
