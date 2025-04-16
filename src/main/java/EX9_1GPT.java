import java.util.Scanner;

public class EX9_1GPT {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Raiz número1 número2: ");
        String line = keyboard.nextLine();
        String[] values = line.split("\\s");
        double i,j,k;
        i = Double.parseDouble(values[0]);
        j = Double.parseDouble(values[1]);
        k = Double.parseDouble(values[2]);
        System.out.printf("Raiz de %.2f: %.2f\nPI: %.2f\nMaior valor entre %.2f e %.2f: %.2f", i, Math.sqrt(i), Math.PI, j, k, Math.max(j,k));

    }
}
