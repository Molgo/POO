public class EX11_1GPT{
    public static void main(String [] args){
        for(int i = 0; i <= 50;i++){
            if(i % 5 == 0) continue;
            else if(i % 3 == 0) System.out.printf("%d\t",i);
        }
    }
}
