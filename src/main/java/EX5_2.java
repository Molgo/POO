import java.util.Scanner;

public class EX5_2 {
    public static void main(String [] args){
        int x1, y1, x2, y2, x3, y3;
        double ab, ac, bc;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Primeira coodenada");
        String line = keyboard.nextLine();
        String[] values = line.split("\\s");
        x1 = Integer.parseInt(values[0]);
        y1 = Integer.parseInt(values[1]);

        System.out.print("Segunda coodenada");
        line = keyboard.nextLine();
        values = line.split("\\s");
        x2 = Integer.parseInt(values[0]);
        y2 = Integer.parseInt(values[1]);

        System.out.print("Terceira coodenada");
        line = keyboard.nextLine();
        values = line.split("\\s");
        x3 = Integer.parseInt(values[0]);
        y3 = Integer.parseInt(values[1]);

        ab = Math.sqrt((x1-x2)+(y1-y2));
        ac = Math.sqrt((x1-x3)+(y1-y3));
        bc = Math.sqrt((x2-x3)+(y2-y3));

        if((Math.abs((ac-bc)) < ab && ab < (ac+bc)) && (Math.abs((ab-bc)) < ac && ac < (ab+bc)) && (Math.abs((ab-ac)) < bc && bc < (ab+ac))){
            if(ab == ac && bc == ac){
                System.out.println("Equilártero");
            }else if(ab != ac && bc != ac){
                System.out.println("Escaleno");
            }else{
                System.out.println("Isosceles");
            }
        }else {
            System.out.println("Não é triângulo");
        }
        keyboard.close();
    }
}

/*Exercício 5: Faça um programa que leia três coordenadas num espaço 2D e indique se
formam um triângulo, juntamente com o seu tipo (equilátero, isósceles e escaleno)
    ○ Equilátero: todos os lados iguais
    ○ Isósceles: dois lados iguais
    ○ Escaleno: todos os lados diferentes   */