import java.util.Scanner;

public class EX2_2 {
    public static void main(String [] args){
        Scanner keyboad = new Scanner(System.in);
        System.out.print("a: ");
        int a = keyboad.nextInt();
        System.out.print("b: ");
        int b = keyboad.nextInt();

        int sum = a + b;
        float sumfloat = (float) a+b;
        int sub = a - b;
        float subfloat = (float) a-b;
        int div = a / b;
        float divfloat = (float) a/b;
        int mult = a * b;
        float multfloat = (float) a*b;

        System.out.printf("Soma: %.2f\nSubtração: %.2f\nDivisão: %.2f\nMultiplicação: %.2f", sumfloat, subfloat, divfloat, multfloat);

        keyboad.close();
    }
}

/*Exercício 2: Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.*/
