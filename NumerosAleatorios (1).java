
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Random random = new Random();
  Scanner ler = new Scanner(System.in);
  System.out.print("Informe quantos números deseja: ");
   int n = ler.nextInt();
   for (int i = 1; i <= n; i++){
    int numero = random.nextInt(60);
    System.out.println(numero);
   }
  }
}