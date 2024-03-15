import java.util.Random;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroaleatorio = aleatorio.nextInt(101);
        int tentativas;

        for (tentativas= 1; tentativas <= 5; tentativas++){
            System.out.println("Você esta na " + tentativas + " tentativa!");
            System.out.println("Adivinhe o numero de 1 a 100");

            int numero = leitura.nextInt();

            if(numero < 0||numero > 100){
                System.out.println("Invalido");
                tentativas--;
            } else if(numero == numeroaleatorio){
                System.out.println("Parabens, acertou!");
                break;
            } else if(numero > numeroaleatorio){
                System.out.println("Menos!");
            } else{
                System.out.println("Mais!");
            }
        }
        if (tentativas > 5){
            System.out.println("Acabaram suas tentativas, o numero era: " + numeroaleatorio);
        }
    }
}
