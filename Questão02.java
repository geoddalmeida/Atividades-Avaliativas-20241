/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
package Questões;
import java.util.Scanner;
public class Questão02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Digite seu nome de usuario: ");
            String nomeUsuario = scanner.nextLine();
            
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();
            
            if (nomeUsuario.equals(senha)) {
                System.out.println("Erro: A senha nao pode ser igual ao nome de usuario. Tente novamente.");
            } else {
                System.out.println("Usuario e senha cadastrados com sucesso.");
                break;
            }
        }
    }
}
