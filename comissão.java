import java.util.Scanner;
/*
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas
(4% do valor das vendas efetuadas pelo funcionário). 
Faça um programa que receba o salário fixo do funcionário e o valor de suas 
vendas, calcule e mostre a comissão e seu salário final.
*/

public class comissão {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
        
            //double salarioBruto = 2500;    // Comentei essa linha para o usuário 
            double venda1, venda2, venda3;   // informar o valor do seu salário.
            int salarioBruto;
            
            System.out.println("Digite seu salário: ");
            salarioBruto = scan.nextInt();
            /*System.out.println("O salário é: " + salarioBruto);*/
            
            System.out.println("\n Informe o valor da primeira venda. ");

            venda1 = scan.nextInt();
            venda1 = (venda1 * 0.04);  
            System.out.println("Comissão: " + venda1);  
            
            System.out.println("Informe o valor da segunda venda. ");
            
            venda2 = scan.nextInt();
            venda2 = (venda2 * 0.04);
            System.out.println("Comissão: " + venda2);

            System.out.println("Informe o valor da Terceira venda. ");
            
            venda3 = scan.nextInt();
            venda3 = (venda3 * 0.04);
            System.out.println("Comissão: " + venda3);

            System.out.println("\n O valor do salário é: " + salarioBruto);
            System.out.println("\n O total da comissão é: " + (venda1+venda2+venda3));
            
            double salarioLiquido = (venda1 + venda2 + venda3) + salarioBruto;
            System.out.println("\n O valor do salário a receber é: " + salarioLiquido);
            
            
        }
    }
}