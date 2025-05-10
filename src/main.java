import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();

        if (numeroIngresado > 100) {
            System.out.println("El número es mayor a 100.");
        }

        if (numeroIngresado <= 100) {
            System.out.println("El número no es mayor a 100.");
        }
    }
}

