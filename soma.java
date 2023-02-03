import java.util.Scanner;

/* 1. Faça um programa que receba dois números, 
      calcule e mostre a subtração 
      do primeiro número pelo segundo. */

public class soma {
    
    public static void main(String[] args){ 
        try (Scanner scan = new Scanner(System.in)){

            int a ;
            int b ;
                           
                                
                    System.out.print("Digite o primeiro número: ");
                    a = scan.nextInt();
              
                    System.out.print("Digite o segundo número: ");
                    b = scan.nextInt();
              
                    int c = a - b;
                    System.out.println("Resultado da subtração: " + c);
                }
                
        }
    }
