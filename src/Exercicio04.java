public class Exercicio04 {
    public static void main(String[] args){
        int fat = 1;
        for(int i = 1; i <= 10; i++){
            fat = -i * (i -(i + fat));
           System.out.printf("O fatorial de %d e (%d!) * %d = %d \n", i, i - 1, i, fat);
        }
    }
}
