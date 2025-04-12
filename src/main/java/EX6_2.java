import java.util.Scanner;

public class EX6_2 {
    public static  void main(String [] args){
        String name;
        int price, qnt;

        System.out.print("Insira o nome do produto o preço e a quantidade: ");
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        String[] values = line.split("\\s");

        name = values[0];
        price = Integer.parseInt(values[1]);
        qnt = Integer.parseInt(values[2]);

        if(qnt > 10 && qnt <= 20){
            price = (price/10) * 9;
        }else if(qnt > 20 && qnt <= 50){
            price = (price/10) * 8;
        }else if(qnt > 50){
            price = ((price/10) * 7) + (price/20);
        }

        System.out.printf("O valor a ser pago por %d unidades de %s é de %dR$", qnt, name, price);
        keyboard.close();
    }
}

/*Exercício 6: Faça um programa que para cada produto informado (nome, preço e
quantidade), escreva o nome do produto comprado e o valor total a ser pago, considerando
que são oferecidos descontos pelo número de unidades compradas, segundo as opções
abaixo:
    a. Até 10 unidades: valor total
    b. de 11 a 20 unidades: 10% de desconto
    c. de 21 a 50 unidades: 20% de desconto
    d. acima de 50 unidades: 25% de desconto*/
