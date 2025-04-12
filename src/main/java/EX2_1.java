import java.util.Scanner;

public class EX2_1 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        float celcius = keyboard.nextFloat();

        float fahrenheit = (celcius * (float) 1.8) + 32;
        System.out.printf("%.2f°C equivalem a %.2f°F.",celcius, fahrenheit);
        keyboard.close();
    }
}

/* 2 - Crie um programa que converta uma temperatura fornecida em graus Celsius para
       Fahrenheit usando a fórmula:

       F=(C×1.8)+32

       Exemplo de entrada: Digite a temperatura em Celsius: 25

       Exemplo de saída: 25°C equivalem a 77°F */
