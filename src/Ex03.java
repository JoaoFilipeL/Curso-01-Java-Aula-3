import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int escolha =0;

        while(escolha != 2) {
            System.out.println("Escolha : ");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do circulo");
            escolha = leitura.nextInt();

            if (escolha == 1){
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            }else{
                System.out.println("Opção invalida");
            }
        }

    }
}
