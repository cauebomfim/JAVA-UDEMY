public class exercicio2 {
 public static void main(String[] args) {
    /*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o 
    valor da área deste círculo com quatro casas decimais conforme exemplos.  
Fórmula da área: area = π . raio2 
Considere o valor de π = 3.14159    
   
Exemplos: 
 
 Entrada:   Saída:  
 2.00       A=12.5664  
    
 Entrada:   Saída:  
 100.64     A=31819.3103  
    
 Entrada:   Saída:  
 150.00     A=70685.7750
    */


double pi,A,B,C;

 pi = (double) 3.14159;
 A = (double) 2.00;
 B = (double) 100.64;
 C = (double) 150.00;

 double respostaA = pi * A * A;
 double respostaB = pi * B * B;
 double respostaC = pi * C * C;

 System.out.printf("A = %.4f%n", respostaA);
 System.out.printf("A = %.4f%n", respostaB);
 System.out.printf("A = %.4f%n", respostaC);

 }
}
