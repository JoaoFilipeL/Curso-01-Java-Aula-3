import java.util.Scanner;

public class usandoScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite o valor de investimento nesse mes: ");
        double valor = scan.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");
    }
}
