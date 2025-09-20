package curso_alura;

import java.util.Scanner;

public class Exercicio_Casting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite a temperatura");
    double temperatura = scanner.nextInt();

    double fahrenheit = (temperatura * 1.8) + 32;
    int vcasting = (int) (fahrenheit);

    System.out.println("a temp em Fahrenheit é: " + vcasting);
    scanner.close();
  }
}