import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();
        if (numero < 0){
            System.out.println("Numero negativo!");
        }else {
            System.out.println("Numero positivo!");
        }

    }
}
