public class array {
        public static void main(String[] args) {
             int[][] tablica = new int[5][5];
                for (int i = 0; i < 5; i++) {
                 for (int j = 0; j < 5; j++) {
        
                    if (i == 0 || i == 4 || j == 0 || j == 4) {
        
            tablica[i][j] = 1;
    } else {
    
        tablica[i][j] = 0;
    }
    }
     }
    
        for (int i = 0; i < 5; i++) {
    
        for (int j = 0; j < 5; j++) {
    System.out.print(tablica[i][j] + " ");
    }
    System.out.println();
        }
     }
    }
    