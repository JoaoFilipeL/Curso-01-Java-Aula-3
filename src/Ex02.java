import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 = leitura.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int num2 = leitura.nextInt();

        if (num1 == num2){
            System.out.println("Os numeros são iguais");
        }else if(num1 != num2 && num1 > num2){
            System.out.println("Os numeros são diferentes e o primeiro é maior");
        }else{
            System.out.println("Os numeros são diferentes o segundo é maior");
        }
    }
}
