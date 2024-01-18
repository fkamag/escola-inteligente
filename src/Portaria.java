import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println();
    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    System.out.println("----- Percentual -----");
    double percI = (((double) qtdFundamental1 / total) * 100);
    double percII = (((double) qtdFundamental2 / total) * 100);
    double percMed = (((double) qtdMedio / total) * 100);

    System.out.println("Ensino Fundamental I: " + formatarNumero(percI) + "%");
    System.out.println("Ensino Fundamental II: " + formatarNumero(percII) + "%");
    System.out.println("Ensino Médio: " + formatarNumero(percMed) + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    int contFundI = 0;
    int contFundII = 0;
    int contMedio = 0;

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");
      String menuOption = scanner.next();
      if (menuOption == "1") {
        System.out.println("Entre com a idade da pessoa estudante:");
        int age = scanner.nextInt();
        if (age <= 10) {
          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
          contFundI += 1;
        } else if (age <= 14) {
          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
          contFundII += 1;
        } else {
          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
          contMedio += 1;
        }
      } else if (menuOption == "2") {
        emitirRelatorio(contFundI, contFundII, contMedio);
        break;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }
  }

  /**
   * Método formatarNúmero.
   */
  public static String formatarNumero(double number) {
    DecimalFormat df;
    DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ENGLISH);
    if (number * 10 % 1 == 0) {
      df = new DecimalFormat("0.0", dfs);
    } else {
      df = new DecimalFormat("0.##", dfs);
    }
    return df.format(number);
  }

}
