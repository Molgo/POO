import java.util.Scanner;

public class EX4_2 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        float m, s, gas;
        System.out.print("Distância percorrida em metros: ");
        m = keyboard.nextFloat();
        System.out.print("Tempo decorrido em segundos: ");
        s = keyboard.nextFloat();
        System.out.print("Gasolina consumida em litros: ");
        gas = keyboard.nextFloat();

        double vm = m/s * 3.6;
        double kml = (m/1000) / gas;

        System.out.printf("Velocidade média: %.2f(Km/h)\nCombustível comsumido: %.2f(Km/L)", vm, kml);

        keyboard.close();
    }
}

/*Exercício 4: Faça um programa que leia a distância percorrida por um carro, o tempo gasto
e a quantidade de gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e
o consumo de combustível (Km/l).*/
