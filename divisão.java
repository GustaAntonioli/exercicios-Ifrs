import java.util.Scanner;

/*Faça um programa que receba dois números, 
calcule e mostre a divisão do primeiro pelo segundo. 
Sabe-se que o segundo número não pode ser zero, portanto
não é necessário se preocupar com isso neste exercício.*/

    
public class divisão {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){

            int a;
            int b;

            System.out.print("Digite o primeiro número: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            b = scan.nextInt();

            int c = a/b;
            System.out.println("Resultado da Divisão: " + c);
            
        }
    }
}
