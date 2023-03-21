import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;

        while(true) {
            try {
                System.out.println("Digite um número");
                n1 = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, digite um número.");
                input.nextLine();
            }
        }

        while(true) {
            try {
                System.out.println("Digite outro número");
                n2 = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, digite um número.");
                input.nextLine();
            }
        }

        int operation = 0;

        while(true) {
            try {
                System.out.println("Escolha a operação que você deseja : \n 1 : Soma \n 2 : subtração \n 3 : multiplicação \n 4 : divisão ");
                operation = input.nextInt();

                if( operation == 1 ) {
                    System.out.println("Resultado da soma : " + (n1 + n2) );
                } else if ( operation == 2 ) {
                    System.out.println("Resultado da subtração : " + (n1 - n2) );
                } else if( operation == 3 ) {
                    System.out.println("Resultado da multiplicação : " + (n1*n2) );
                } else if( operation == 4 ) {
                    System.out.println("Resultado da divisão : " + (n1/n2) );
                }
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválidam digite un múmero de 1 a 4");
                input.nextLine();
            }
        }

    }

}