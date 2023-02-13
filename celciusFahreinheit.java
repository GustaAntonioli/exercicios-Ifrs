import java.util.Scanner;

 /*Faça um programa que receba uma temperatura em Celsius, 
 calcule e mostre essa temperatura em Fahrenheit. Sabe-se que 
     𝐹 = 9 × 𝐶 + 32  ou F = C x 1,8 + 32
          /5                       */

public class celciusFahreinheit {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            float c;
            float f;

            System.out.println("Informe o valor em C° ");
            c = scan.nextFloat();

            f = (float) ((c*1.8)+32);
            System.out.println("A temperatura em Fahreinheit é: " + f + "°F");
        }
    }
}
