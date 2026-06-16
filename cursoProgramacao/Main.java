import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        String y;
        int a;
        char b;


        x = sc.nextDouble();
        y = sc.next();
        a = sc.nextInt();
        b = sc.next().charAt(0);
        
        System.out.printf("voce digitou %.2f%n",x);
        System.out.println("voce digitou " + y);
        System.out.println("voce digitou " + a);
        System.out.println("voce digitou o caractere: " + b);
        System.out.println(x + y + a + b);
        sc.close();
    }
}*/

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        int x;
        x = sc.nextInt();
        sc.nextLine();
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}