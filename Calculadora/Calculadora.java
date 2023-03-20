import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número");
        double n1 = input.nextDouble();

        System.out.println("Digite outro número");
        double n2 = input.nextDouble();

        System.out.println("Escolha a operação que você deseja : \n 1 : Soma \n 2 : subtração \n 3 : multiplicação \n 4 : divisão ");
        int operation = input.nextInt();
        if( operation == 1 ) {
            System.out.println("Resultado da soma : " + (n1 + n2) );
        } else if ( operation == 2 ) {
            System.out.println("Resultado da subtração : " + (n1 - n2) );
        } else if( operation == 3 ) {
            System.out.println("Resultado da multiplicação : " + (n1*n2) );
        } else if( operation == 4 ) {
            System.out.println("Resultado da divisão : " + (n1/n2) );
        } else {
            System.out.println("Entrada inávlida");
        }

        input.close();
    }

}