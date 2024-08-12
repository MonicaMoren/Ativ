import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    System.out.println("Digite um número: ");
System.out.println(numero);
if(numero > 0 ){
System.out.println("O numero é Positivo:");
}
    if(numero < 0 ){
    System.out.println("O numero é Negativo:");
    }
    if(numero == 0 ){
    System.out.println("O numero é Zero:");
    
    }
  sc.close();
  }
}