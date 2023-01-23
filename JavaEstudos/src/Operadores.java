import java.util.Scanner;

public class Operadores {

    private static Scanner entrada;

    public static void main(String[] args) {

        double vA;
        double vB;
        
        entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        vA = entrada.nextDouble();
        
        System.out.println("Digite um número: ");
        vB = entrada.nextDouble();
       
        System.out.println("A média dos números é: " + (vA + vB)/ 2 );

        if ((vA + vB)/ 2 >= 7){

            System.out.println(" Aprovado!!");

        } else {

            System.out.println(" Reprovado!!");

        

        }


    }

    }
