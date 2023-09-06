import java.util.*;

public class EjerciciaA {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero a evaluar: ");
        
        try {
            long x = sc.nextLong();
            System.out.print(x + " puede ser almacenado en: ");
            
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.print("byte, ");
            }
            
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.print("short, ");
            }
            
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.print("int, ");
            }
            
            System.out.println("long.");
        } catch (Exception e) {
            System.out.println("El valor no puede ser almacenado en ningun tipo de dato.");
        }
    }
}
