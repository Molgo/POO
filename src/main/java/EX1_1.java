import java.util.Scanner;

public class EX1_1 {
    public static void main(String [] args){
        String nome;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = keyboard.nextLine();

        System.out.printf("Olá, %s. Bem vindo ao JAVA!", nome);
        keyboard.close();
    }
}

/* 1 - Crie um programa que peça ao usuário para digitar seu nome e, em seguida, exiba uma
       mensagem personalizada com o nome informado.

       Exemplo de entrada: Digite seu nome: Rebeca

       Exemplo de entrada: Olá, Rebeca! Bem-vindo ao Java! */
