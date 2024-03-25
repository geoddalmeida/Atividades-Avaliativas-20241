/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem 
caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
package Questões;
import java.util.Scanner;
public class Questão01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        do{
            System.out.print("Informe uma nota: ");
            i = scanner.nextInt();
            if(i<0 || i>10){
            System.out.print("Essa nota e invalida.");
            }
        } while (i>0 && i<10);
        
    }
}
/*
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main ()
{
    printf (setlocale (LC_ALL, ""));

    int num, t = 0;

    printf ("\n\n");
    printf ("Digite os números da sua escolha:\n\n");

    do
    {
        printf ("\t\t");
        scanf ("%d", &num);
        t += num;
    }

    while (num != 0);

    printf ("\nO resultado da soma dos números digitados é igual à %d.\n\n", t);

    system ("pause");
    return 0;
}


*/