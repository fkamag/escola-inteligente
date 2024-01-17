import java.util.Scanner;

public class App {

  /**
   * Método principal.
   */
  public static void main(String[] args) {

    boolean isFinal = false;
    String menuOption;

    while (!isFinal) {

      System.out.println("Boas vindas a Escola Inteligente!");
      System.out.println("Escolha um departamento:");
      System.out.println("1 - Pessoa Estudante - Calcular idade em dias");
      System.out.println("2 - Secretaria - Calcular a média das notas");
      System.out.println("3 - Portaria - Gerar relatório de controle de acesso");
      System.out.println("4 - FIM");

      Scanner scanMenu = new Scanner(System.in);
      menuOption = scanMenu.next();

      switch (menuOption) {
        case "1":
          PessoaEstudante.coletarInformacoes();
          break;
        case "2":
          Secretaria.coletarInformacoes();
          break;
        case "3":
          Portaria.coletarInformacoes();
          break;
        case "4":
          isFinal = true;
          scanMenu.close();
          break;
        default:
          System.out.println("Opção Inválida.");
      }

    }


    System.out.println("Obrigado por utilizar nossos serviços!");

  }

}
