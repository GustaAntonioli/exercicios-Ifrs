import java.util.Scanner;

/*Sabe-se que: 1 pés = 12 polegadas 1 jarda = 3 pés 1 milha = 1.760 jardas. 
Faça um programa que receba uma medida em pés, faça as conversões a seguir 
e mostre os resultados. 
a. polegadas; b. jardas; c. milhas. 
*/

public class medida {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){

            double cm = 0, m = 0, yd = 0, in = 0, ft = 0;
            double mi = 0.000;

            System.out.print("\n-A calculadora utiliza a medida em metro como padrão.\n");
            System.out.print("\n-Digite um número para conversão: \n");

            m = scan.nextInt();
            ft = (m*3.2808);
            System.out.print("\n-O valor em pé(ft) é: " + ft + "\n");

            m = scan.nextInt();
            yd = (m*1.0936);
            System.out.print("\n-O valor em Jardas(yd) é: " + yd + "\n");

            m = scan.nextInt();
            in = (m*39.37);
            System.out.print("\n-O valor em Polegadas(in) é: " + in + "\n");

            m = scan.nextDouble();
            mi = Math.round (m*0.00062137);
            System.out.print("\n-O valor em Milhas(mi) é: " + mi + "\n");
        }
    }
}
