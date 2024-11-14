import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Digite um numero inteiro: ");
            numero = teclado.nextInt();
        }while(numero < 0);
        
        for(int i = 1; i <= numero; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d ", j*i);
            }
            System.out.println("");
        }
    }
}
