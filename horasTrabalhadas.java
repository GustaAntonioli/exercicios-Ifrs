import java.util.Scanner;

 /*Faça um programa que receba o número de horas trabalhadas o valor do salário mínimo, calcule e mostre o salário
 a receber seguindo estas regras: 
 a. a hora trabalhada vale um décimo do salário mínimo --> Valor do salário bruto: 3000 / 30 = 100 reais = 8h
                                                       --> Valor de uma hora diária: 100 / 8 = 12,50 reais.
                                                       --> Valor de um décimo da hora: 12,50 / 10 = 1,25 reais.
 b. o salário bruto equivale ao número de horas        --> Valor bruto: 3000,00
 trabalhadas multiplicado pelo valor da hora trabalhada; 
 c. o imposto equivale a 3% do salário bruto;          --> 3000,00 - 3% = 2.910,00
 d. o salário a receber equivale ao salário bruto menos o imposto. --> 2.910 */


public class horasTrabalhadas {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            /*float salarioBruto = 3000;
            float salarioLiquido = salarioBruto - ((salarioBruto/100)*3);
            float valorSalarioDia = salarioBruto / 30;
            float valorSalarioHora = valorSalarioDia / 8;
            float umDecimoSalarioHora = valorSalarioHora / 10;

            System.out.printf("\nOs dados do seu Contra-cheque são: \n");
            System.out.println("\nO Seu salário bruto é: " + salarioBruto);
            System.out.println("O Valor do seu dia é: " + valorSalarioDia);
            System.out.println("O valor da sua hora trabalhada é: " + valorSalarioHora);
            System.out.println("O valor de um décimo da sua hora é: " + umDecimoSalarioHora);
            System.out.println("O seu salário liquido com 3% de imposto é: " + salarioLiquido);*/

            //Segunda opção com o usuário digitando seu salário bruto;

            float salarioBruto;
                        
                        
            System.out.println("\nDigite o valor do seu salário Bruto.\n");
            salarioBruto = scan.nextFloat();
            

            float valorSalarioDia = salarioBruto / 30;
            System.out.println("\nO Valor do seu dia é: " + valorSalarioDia);
            
            float valorSalarioHora = valorSalarioDia / 8;
            System.out.println("O valor da sua hora trabalhada é: " + valorSalarioHora);
            
            float umDecimoSalarioHora = valorSalarioHora / 10;
            System.out.println("O valor de um décimo da sua hora é: " + umDecimoSalarioHora);
            
            float salarioLiquido = salarioBruto - ((salarioBruto/100)*3);
            System.out.println("O seu salário liquido com 3% de imposto é: " + salarioLiquido);

        }
    }
}
