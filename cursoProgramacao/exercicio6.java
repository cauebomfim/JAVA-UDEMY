import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();

        double tri = A * C / 2;
        double cir = 3.14159 * C * C;
        double trap = (A + B) * C / 2;
        double quad = B * B;
        double ret = A * B;

        System.out.printf("Triangulo %.3f%n: ", tri);
        System.out.printf("Circulo %.3f%n: " , cir);
        System.out.printf("Trapezio %.3f%n: ", trap);
        System.out.printf("Quadrado %.3f%n: ", quad);
        System.out.printf("Retangulo %.3f%n: ", ret);

        sc.close();

    }
}
