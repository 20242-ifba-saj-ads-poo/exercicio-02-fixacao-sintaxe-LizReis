public class Exercicio06 {
    public static void main(String[] args){
        int atual = 1, anterior = 0;
        
        System.out.printf("%d \n%d\n", anterior, atual);
        
        for(int proximo = anterior + atual; proximo <= 100; proximo = anterior + atual){
            System.out.println("" + proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
