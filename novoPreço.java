import java.util.Scanner;

/*Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
sabendo-se que este sofreu um desconto de 10%. 
Por exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos 10% de cem, 
que é 100 x 10 / 100. Essa conta é igual a 10, 
ficando o novo preço R$ 90,00.*/

public class novoPreço {
    public static void main(String[] args){
        try (Scanner scan = new Scanner (System.in)){

            float banana = (float) 5.99;
            float desconto = banana - ((banana / 100)*10);

            System.out.printf("O preço com desconto é: %.2f", desconto);
        }
    }
}
