import java.util.InputMismatchException;
import java.util.Scanner;

public class CelciusFare {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double celcius = 0;

        while(true) {
            try {
                System.out.println("Digite a temperatura em graus : ");
                celcius = input.nextDouble();
                double fahrenheit = (celcius * 1.8 + 32);
                System.out.println("Sua temperatura em Fahrenheit : " + fahrenheit);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, digite um número.");
                input.nextLine();
            }
        
        }
        input.close();
    }
}