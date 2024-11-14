public class Exercicio05 {
    public static void main(String[] args){
        //Começa a dar erro com int porque ele não comporta a quantidade de numeros que os fatoriais de 20 para cima possui
        long fat = 1;
        for(int i = 1; i <= 20; i++){
            fat = -i * (i -(i + fat));
           System.out.printf("O fatorial de %d e (%d!) * %d = %d \n", i, i - 1, i, fat);
        }
    }
}
