public class Main {

   
    public static void main(String[] args){
        zero test = new zero();
        System.out.println("Number1: "+ test.number);
        //Number 0
        add(test);
        System.out.println("Number2: "+ test.number);
        //number 100
        zero.say ("Ja","kocham","programowac","w","Javie","xDDDD");
       

    }

    static void add(zero test ){
        test.number=test.number + 50;
    }



    
}