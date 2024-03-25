/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
de anos necessários para que a população do país A ultrapasse ou iguale a 
população do país B, mantidas as taxas de crescimento.*/
package Questões;
public class Questão04 {
    public static void main(String[] args){
        int habitantesA = 80000, habitantesB = 200000, anosNecessarios=0;
        double taxaCrescimentoA = 0.03, taxaCrescimentoB = 0.015;
        
        while (habitantesA<=habitantesB){
            habitantesA += (habitantesA*taxaCrescimentoA);
            habitantesB += (habitantesB*taxaCrescimentoB);
            anosNecessarios++;
        }

        System.out.println("Numero de anos necessarios: " + anosNecessarios); 
    }
}
