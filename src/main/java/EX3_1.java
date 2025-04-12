import java.util.Scanner;

public class EX3_1 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        if(i % 2 == 0){
            System.out.print("É par.");
        }else{
            System.out.print("Não é par.");
        }

        keyboard.close();
    }
}

/* 3 - Crie um programa que peça um número ao usuário e diga se ele é par ou ímpar.

       Exemplo de entrada: Digite um número: 10

       Exemplo de saída: O número 10 é par. */