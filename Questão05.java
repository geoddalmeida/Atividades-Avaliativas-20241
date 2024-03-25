/*Altere o programa anterior permitindo ao usuário informar as populações e as 
taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.*/
package Questões;
import java.util.Scanner;
public class Questão05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int anosNecessarios=0;
        
        System.out.print("Numero de habitantes do pais A: ");
        int habitantesA = scanner.nextInt();
        System.out.print("Numero de habitantes do pais B: ");
        int habitantesB = scanner.nextInt();
        System.out.print("Taxa de crescimento do pais A: ");
        double taxaCrescimentoA = scanner.nextDouble();
        System.out.print("Taxa de crescimento do pais B: ");
        double taxaCrescimentoB = scanner.nextDouble();
        
        while (habitantesA<=habitantesB){
            habitantesA += (habitantesA*taxaCrescimentoA);
            habitantesB += (habitantesB*taxaCrescimentoB);
            anosNecessarios++;
        }

        System.out.println("\nNumero de anos necessarios: " + anosNecessarios); 
    }
}
