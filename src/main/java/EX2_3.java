import java.util.Scanner;

public class EX2_3 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int f0 = 0, f1 = 1, fn;
        System.out.print("0\t");
        if(n >= 1) System.out.print("1\t");
        for(int i = 1; i < n; i++) {
            fn = f0 + f1;
            System.out.printf("%d\t", fn);
            f0 = f1;
            f1 = fn;
        }
    }
}

/*Exercício 2. Calcule a série de Fibonacci para um número inteiro não negativo informado
pelo usuário. A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número
posterior equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo,
caso o usuário informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.*/


