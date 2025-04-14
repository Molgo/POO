import javax.swing.*;
import java.util.Scanner;

public class EX1_3 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Número: ");
        int number = keyboard.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println("Tabuada de " + i);
            for (int j = 1; j <= number; j++) {
                System.out.printf("%d x %d = %d\t",i, j, j*i);
            }
            System.out.println(" ");
        }
    }
}

/*Exercício 1. Construa a tabela de multiplicação de números de 1 a 10*/
