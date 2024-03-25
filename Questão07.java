/*Faça um programa que leia 5 números e informe o maior número.*/
package Questões;
import java.util.Scanner;
public class Questão07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        
        for(int i=0;i<5;i++){
            System.out.print("Informe um numero: ");
            int num = scanner.nextInt();
        
            if (num > maior) {
                maior = num;
            }
        }  
        
        System.out.println("O maior numero digitado e: " + maior);
    }
}
