import java.util.Scanner;

public class EX2_1GPT {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int a,b;
        a = keyboard.nextInt();
        b = keyboard.nextInt();

        //System.out.print(Math.max(a, b));

        if(a>b) System.out.print(a);
        else System.out.print(b);
    }
}
