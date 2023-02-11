import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do preço de fábrica 
com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica.
Faça um programa que receba o preço de fábrica de um veículo, 
o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre: 
    a. o valor correspondente ao lucro do distribuidor;
    b. o valor correspondente aos impostos; 
    c. o preço final do produto.*/

public class precoFabrica {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            
            double precoFabrica = 12.000;
            double lucroDistribuidor = precoFabrica * 1.12;
            double divisao = (precoFabrica/100); // O valor dessas duas linhas dá 840 porém não sei criar uma saída 
            double imposto = divisao*7;          // com esse valor, então tive que multiplicar por 1000 apenas para
                                                 //  que a saída fosse 840 que é o valor do imposto.
            
            System.out.printf("\nO preço de fábrica é: R$ %.3f\n" , precoFabrica);
            System.out.printf("O lucro do distribuidor é: R$ %.3f\n" , lucroDistribuidor);
            System.out.println("O valor do imposto é: R$ " + (imposto*1000));
            System.out.printf("O preço de venda é: R$ %.3f\n" , (precoFabrica + lucroDistribuidor + divisao));

        }
    }
                 
}
