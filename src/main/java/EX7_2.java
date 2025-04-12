import java.util.Scanner;

public class EX7_2{
    public static void main(String [] args){

        int n, x, y, l;
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        String[] values = line.split("\\s");

        n = Integer.parseInt(values[0]);
        x = Integer.parseInt(values[1]);
        y = Integer.parseInt(values[2]);

        if(x > y){
            l = y;
            y = x;
            x = l;
        }

        if(n < x){
            System.out.printf("%d é menor do que o intervalo [%d,%d]", n, x, y);
        }else if(n > y){
            System.out.printf("%d é maior do que o intervalo [%d,%d]", n, x, y);
        }else{
            System.out.printf("%d esta no intervalo [%d,%d]", n, x, y);
        }
        keyboard.close();
    }
}
/*Exercício 7: Leia um número inteiro n e mais dois números (maior ou menor) que formam
um intervalo. Ao final, imprima uma mensagem informando se n está antes, dentro ou
depois do intervalo.*/

//testagem