import java.util.Scanner;

public class EX3_2 {
    public static void main(String[] args) {
        System.out.print("Tempo em segundos: ");
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;

//        while(t >= 60){
//            if(t >= 3600){
//                t -= 3600;
//                h++;
//            }else{
//                t -= 60;
//                m++;
//            }
//        }

        h = t / 3600;
        m = (t % 3600) / 60;
        s = (t%3600)%60;

        System.out.printf("%dh%dm%ds", h, m, s);

        keyboard.close();

    }
}
/*Exercício 3: Leia uma variável t com um tempo qualquer em segundos e imprima esse
valor em hora, minuto e segundo.*/