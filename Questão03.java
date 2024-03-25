/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/
package Questões;
import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
        } while(nome.length() <= 3);
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
        } while(idade<0 || idade>150);
        do {
            System.out.print("Salario: ");
            salario = scanner.nextDouble();
        } while(salario<=0);
        do {
            System.out.print("Sexo: ");
            sexo = scanner.next().charAt(0);
        } while(sexo != 'f' && sexo != 'm');
        do {
            System.out.print("Estado Civil: ");
            estadoCivil = scanner.next().charAt(0);
        } while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
    }
}

