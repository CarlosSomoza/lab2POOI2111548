package ejercicia.a;

import java.util.Scanner;

public class EjercicioB{
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if (N % 2 != 0) {
            System.out.println("Luna");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Sol");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Tierra");
        } else if (N > 20) {
            System.out.println("Galaxia");
        }
        
        scanner.close();
    }
}
