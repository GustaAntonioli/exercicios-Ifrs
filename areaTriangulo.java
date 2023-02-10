import java.util.InputMismatchException;
import java.util.Scanner;

/*Faça um programa que calcule e mostre a área de um triângulo. 
Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser 
informadas pelo usuário.*/

public class areaTriangulo{
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)){

            float b = 0;
            float h = 0;
            

            while (true) {
                System.out.println("\n Informe o valor da base: ");
                    try {
                        b = scan.nextFloat();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido para a base, por favor digite " + "(,)" + " não " + "(.)" + " para um número válido");
                        scan.next();
                    }
            }

            while (true){
                System.out.println("\n Informe o valor da altura: ");
                    try {
                        h = scan.nextFloat();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido para a base, por favor digite" + "," + "não" + "." + "para um número válido");
                        scan.next();
                    }
                }
                        float a = ((b*h)/2);
                            System.out.println("\nO valor da área do triângulo é: " + a);
        }
    }
}