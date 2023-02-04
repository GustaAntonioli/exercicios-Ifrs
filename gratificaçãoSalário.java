import java.util.Scanner;

/*Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
sabendo-se que o funcionário tem gratificação de 5% sobre o salário base (que será acrescentado ao salário) 
e paga imposto de 7% sobre este salário (o que será descontado do salário).*/

public class gratificaçãoSalário {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            
            // Gratificação = 5% (2.300 + (2.300/100)*5) ou Gratificação = 5% (2.300 *0.05)
            // imposto = 7% (2.300 + (2.300/100)*7) ou imposto = 7% (2.300 *0.07)

            double salarioBruto = (2.300) ;
            double salarioComGratificação = salarioBruto + ((salarioBruto/100)*5);
            double salarioLiquido = salarioComGratificação - ((salarioComGratificação/100)*7);
                
                
                salarioLiquido = salarioComGratificação - ((salarioComGratificação/100)*7);
                System.out.println("O valor do salário líquido a receber é: R$ " + salarioLiquido);
            
        }
    }
    
}

