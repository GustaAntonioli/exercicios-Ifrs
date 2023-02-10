import java.util.InputMismatchException;
import java.util.Scanner;

/*Faça um programa que calcule e mostre a área de um quadrado. 
 Sabe-se que 𝐴 = 𝑙𝑎𝑑𝑜 X 2*/


public class areaQuadrado{
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)){

            float l = 0;

            while (true) {
                System.out.println("\n Informe o valor do lado: ");
                    try {
                        l = scan.nextFloat();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido, por favor digite " + "(,)" + " não " + "(.)" + " para um número válido");
                        scan.next();
                    }
            }

            
                        float a = (l*l);
                            System.out.println("\nA área do triângulo é: " + a);
        }
    }
}