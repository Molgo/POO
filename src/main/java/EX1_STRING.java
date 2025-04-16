import java.util.Scanner;

public class EX1_STRING {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        String frase, line = keyboard.nextLine();
        frase = line;
        int cont = 0, i = line.indexOf(" ");
        char[] vasco;

        while(i != -1){
            line = line.substring(0,i) + line.substring(i+1);
            i = line.indexOf(" ");
        }

        System.out.printf("Total de caracteres: %d\n", line.length());

        System.out.printf("Maiúsculo: %s\n", frase.toUpperCase());

        System.out.printf("Maiúsculo: %s\n", frase.toLowerCase());

        vasco = line.toLowerCase().toCharArray();

        for(char c : vasco){
            if (c == 'a' || c == 'â' || c == 'á' || c == 'ã' || c == 'à'){
                cont++;
            }
        }
        System.out.printf("Cont: %d", cont);
    }
}
