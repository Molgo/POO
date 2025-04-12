import java.util.Scanner;

public class EX4_1 {
    public static void main(String [] args){
        System.out.print("Digíte um valor em centavos: ");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        int cont100, cont50, cont25, cont10, cont5, cont1;
        cont100 = cont50 = cont25 = cont10 = cont5 = cont1 = 0;


        while(i > 0){
            if(i >= 100){
                i -= 100;
                cont100++;
            }else if(i >= 50){
                i -= 50;
                cont50++;
            }else if(i >= 25){
                i -= 25;
                cont25++;
            }else if(i >= 10){
                i -= 10;
                cont10++;
            }else if(i >= 5){
                i -= 5;
                cont5++;
            }else{
                i -= 1;
                cont1++;
            }
        }

        System.out.printf("Para o valor %d centavos, a menor quantidade de moedas é %d moedas\n" +
                "de 1 real, %d moeda de 50 centavos, %d moeda de 25 centavos, %d moeda de 10\n" +
                "centavos, %d moeda de 5 centavos e %d moeda de 1 centavo.", i, cont100, cont50, cont25, cont10, cont5, cont1);

        keyboard.close();
    }
}

/* 4 - Crie um programa para, a partir de um valor informado em centavos, indicar a menor
       quantidade de moedas que representa esse valor

– Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real

– Exemplo: Para o valor 209 centavos, a menor quantidade de moedas é 2 moedas
           de 1 real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10
           centavos, 1 moeda de 5 centavos e 0 moeda de 1 centavo. */
