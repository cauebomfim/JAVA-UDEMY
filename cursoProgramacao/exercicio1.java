import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        /*
          Faça um programa para ler dois valores inteiros,
          e depois mostrar na tela a soma desses números com uma mensagem explicativa,
          conforme exemplos.
          
          Exemplos:
          Entrada:
          10
          30
          Saída:
          SOMA = 40
          
          Entrada:
          10
          SOMA = -20
          Saída: -30
          
          Entrada:
          0
          0
          Saída:
          SOMA = 0 
         */

        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Digite o primeiro numero:");
        a = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        b = sc.nextDouble();

        double soma = a + b;

        System.out.printf("A SOMA = %.2f%n",soma);

        sc.close();

    }
}
