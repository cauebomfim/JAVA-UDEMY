import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero do funcionario: ");
         int num = sc.nextInt();
        System.out.println("quantas horas trabalhadas?");
         double hr = sc.nextDouble();
        System.out.println("valor por hrs? ");
        double valor = sc.nextDouble();

        double salario = hr*valor;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = %.2f%n", salario);

        sc.close();

        




    }
}
