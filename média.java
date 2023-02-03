import java.util.Scanner;

/*Faça um programa que receba três notas de um estudante, 
calcule e mostre a média aritmética entre elas.*/

public class média {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){

            double a, b, c, media;
            
                System.out.print("Digite a primeira nota: ");
                a = scan.nextInt();
            
                System.out.println("Digite a segunda nota: ");
                b = scan.nextInt();
            
                System.out.println("Digite a terceira nota: ");
                c = scan.nextInt();

                media = (a+b+c)/3;
                System.out.println("A média é: " + media);

        }
    }
}
