import java.util.Scanner;

/*Faça um programa que receba três notas e seus respectivos pesos, 
calcule e mostre a média ponderada dessas notas. 
Para calcular a média ponderada, multiplique cada nota por seus 
respectivos pesos, some todos os resultados e divida pela soma dos pesos. 
Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, 
a média final do estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. 
Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.*/


public class notaMedia {
    public static void main(String[] args){
        try (Scanner scan = new Scanner (System.in)){
            double nota1, nota2, nota3;
            int peso1 = 1, peso2 = 2, peso3 = 3;

            System.out.print("\nDigite a primeira nota: ");
            nota1 = scan.nextInt();

            System.out.print("\nDigite a segunda nota: ");
            nota2 = scan.nextInt();

            System.out.print("\nDigite a terceira nota: ");
            nota3 = scan.nextInt();

            double somaNotas = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3));
            System.out.print("\nA soma das notas é: " + somaNotas + "\n");

            double mediaPonderada = (somaNotas/6 );
                System.out.print("A média ponderada é: " + mediaPonderada);
        }
    }
}
