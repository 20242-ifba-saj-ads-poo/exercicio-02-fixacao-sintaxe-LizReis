import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Digite um numero inteiro: ");
            numero = teclado.nextInt();
        }while(numero <= 0);
        
        while(numero != 1){
            if(numero % 2 == 0){
                numero /= 2;
            }else{
                numero = (3 * numero) + 1;
            }
            System.out.print(" -> " + numero);
        }
        System.out.println("");
        
    }
}
