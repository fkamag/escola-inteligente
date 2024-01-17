import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    return (nota1 + nota2 + nota3 + nota4) / 4;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o nome da Pessoa Estudante?");
    String name = scanner.next();
    System.out.println("Entre com as notas das provas:");
    System.out.print("Avaliação 1: ");
    String av1 = scanner.next();
    System.out.print("Avaliação 2: ");
    String av2 = scanner.next();
    System.out.print("Avaliação 3: ");
    String av3 = scanner.next();
    System.out.print("Avaliação 4: ");
    String av4 = scanner.next();

    double avaliacao1 = Double.parseDouble(av1);
    double avaliacao2 = Double.parseDouble(av2);
    double avaliacao3 = Double.parseDouble(av3);
    double avaliacao4 = Double.parseDouble(av4);

    double result = calcularMedia(avaliacao1, avaliacao2, avaliacao3, avaliacao4);

    System.out.println("A média das notas de " + name + " é " + result);

  }
}
