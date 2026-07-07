import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        /*
         * 
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
         * calcule e mostre a diferença do produto
         * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         * 
         * 
         * Exemplos:
         * 
         * Entrada: 
         * 5
         * 6
         * 7
         * 8
         * Saída:
         * DIFERENCA = -26
         * 
         * Entrada: 
         * 5
         * 6 -7
         * 8
         * Saída:
         * DIFERENCA = 86
         * 
         */

        Scanner sc = new Scanner(System.in);


System.out.println("Digite o primeiro valor: ");

int a = sc.nextInt();

System.out.println("Digite o segundo valor: ");

int b = sc.nextInt();

System.out.println("Digite o terceiro valor: ");

int c = sc.nextInt();

System.out.println("Digite o quarto valor: ");

int d = sc.nextInt();


int diferenca = (a * b - c * d);



System.out.println("diferenca = " + diferenca);


sc.close();





    }
}
