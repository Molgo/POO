import java.util.Scanner;

public class EX1_2 {
    public static void main(String [] args){
        Scanner keyboad = new Scanner(System.in);
        System.out.print("a: ");
        int a = keyboad.nextInt();
        System.out.print("b: ");
        int b = keyboad.nextInt();

        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mult = a * b;

        System.out.printf("Soma: %d\nSubtração: %d\nDivisão: %d\nMultiplicação: %d", sum, sub, div, mult);

        keyboad.close();
    }
}

/* Exercício 1: Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e
divisão entre elas. */
