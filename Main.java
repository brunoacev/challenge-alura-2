import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CurrencyQuote currentQuote = new CurrencyQuote();

        Scanner fromCurrencyScanner = new Scanner(System.in);
        Scanner toCurrencyScanner = new Scanner(System.in);
        Scanner calculateValue = new Scanner((System.in));

        System.out.println("Challenger Alura - Cotação de Valores");

        System.out.println(" Informe a sigla da cotação de:");
        String fromCurrencyValue = fromCurrencyScanner.nextLine();

        System.out.println(" Informe a sigla da cotação para:");
        String toCurrencyValue = toCurrencyScanner.nextLine();

        System.out.println(" Qual o valor:");
        String searchValue = calculateValue.nextLine();

    }
}