import javax.swing.*;
import java.util.Scanner;

public class EX12_1GPT {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        if(i < 12) System.out.print("Criança");
        else if(i < 18) System.out.print("Adolecente");
        else if(i < 60) System.out.print("Adulto");
        else System.out.print("Idoso");
    }
}
