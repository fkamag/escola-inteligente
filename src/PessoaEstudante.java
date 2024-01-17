import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o nome da Pessoa Estudante?");
    String nameStudent = scanner.next();
    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.print("anos: ");
    String yearAge = scanner.next();
    System.out.print("meses: ");
    String monthAge = scanner.next();
    System.out.print("dias: ");
    String daysAge = scanner.next();
    int year = Integer.parseInt(yearAge);
    int month = Integer.parseInt(monthAge);
    int day = Integer.parseInt(daysAge);
    int result = calcularIdadeEmDias(year, month, day);
    System.out.printf("A idade de %s em dias é %d.\n", nameStudent, result);
  }
}
