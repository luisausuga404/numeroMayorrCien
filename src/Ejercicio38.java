import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 100) {
            System.out.println("El número es mayor a 100.");
        }

        if (numero <= 100) {
            System.out.println("El número no es mayor a 100.");
        }
    }
}

