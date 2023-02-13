import java.util.Scanner;

/*Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
Faça um programa que receba o valor do salário mínimo e a quantidade 
de quilowatts consumida por uma residência, calcule e mostre: 
     a. o valor de cada quilowatt; 
     b. o valor a ser pago por essa residência; 
     c. o valor a ser pago com desconto de 15%.*/

public class preçoKwh {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            float salarioBruto;

            System.out.println("Informe o valor do seu salário.");
            salarioBruto = scan.nextFloat();

            float kwh = (salarioBruto/5);
            System.out.println("\nO valor do kwh é: " + kwh);

            float contaComDesconto = kwh - ((kwh/100)*15);
            System.out.println("\nO valor da conta com desconto de 15% é: " + contaComDesconto);
        }
    }
}
