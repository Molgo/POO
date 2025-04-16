import java.util.Scanner;

public class EX4_1GPT {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        int s = 0;
        while(i != -1){
            s += i;
            i = keyboard.nextInt();
        }
        System.out.print(s);
    }
}
