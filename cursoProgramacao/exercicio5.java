import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("digite o cod do produto: ");
    int cod1 = sc.nextInt();
    System.out.println("digite a quantidade de produto: ");
    int qnt1 = sc.nextInt();
    System.out.println("digite o valor do produto: ");
    double valor1 = sc.nextDouble();

    System.out.println("digite o cod do produto: ");
    int cod2 = sc.nextInt();
    System.out.println("digite a quantidade de produto: ");
    int qnt2 = sc.nextInt();
    System.out.println("digite o valor do produto: ");
    double valor2 = sc.nextDouble();

    double total = qnt1 * valor1 + qnt2 * valor2;


    System.out.printf("valor a pagar %.2f%n",total);



    sc.close();   
    }
}