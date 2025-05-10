package zadanie_2;
import java.util.Scanner;
import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ile razy rzucić kostką? ");
        int n = sc.nextInt();

        int[] wyniki = new int[6];

        for (int i = 0; i < n; i++) {
            int rzut = rand.nextInt(6);
            wyniki[rzut]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ": " + wyniki[i] + " razy");
        }
    }
}