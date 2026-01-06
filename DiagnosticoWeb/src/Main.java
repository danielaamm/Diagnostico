import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int suma = 0;

        do {
            System.out.print("Ingresa un numero: ");
            n = scanner.nextInt();
            suma = suma + n;

            if (n == 0){
                System.out.println("Suma total: " + suma);
            }else{
                System.out.println("Numero ingresado: " + n);
            }
        }while(n != 0);

    }
}