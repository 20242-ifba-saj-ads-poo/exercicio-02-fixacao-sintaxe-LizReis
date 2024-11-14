public class Exercicio06 {
    public static void main(String[] args){
        int atual = 1, anterior = 0;
        
        System.out.printf("%d \n%d\n", anterior, atual);
        
        for(int proximo = anterior + atual; proximo <= 100; proximo = anterior + atual){
            System.out.println("" + proximo);
            anterior = atual;
            atual = proximo;
        }
        //Faz a última soma que não aparece apois ele chegar em 100, nesse caso, o numero anterior foi o 55 + 89 (valor atual), que dará 144
        System.out.println(atual + anterior);
    }
}
