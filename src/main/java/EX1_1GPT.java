import java.util.Scanner;

public class EX1_1GPT {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();

        if(a == 0) System.out.print("Zero");
        else if(a % 2 == 0) System.out.print("Par");
        else System.out.print("Impar");
    }
}
