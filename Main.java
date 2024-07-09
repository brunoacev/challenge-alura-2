import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculateRate calculate = new CalculateRate();

        String fromCurrencyValue = "";
        String toCurrencyValue = "";
        double searchValue = 0;


        Scanner fromCurrencyScanner = new Scanner(System.in);
        Scanner toCurrencyScanner = new Scanner(System.in);
        Scanner valueFromScanner = new Scanner((System.in));

        System.out.println("Challenger Alura - Cotação de Valores");
        System.out.println("* Exemplos de sigla de cotação: USD, BRL, EUR, CNY *");


        System.out.println(" Informe a sigla da cotação de:");

        while(fromCurrencyValue.length() != 3){

            fromCurrencyValue = fromCurrencyScanner.nextLine();

            if (fromCurrencyValue.length() != 3) {
                System.out.println("Não foi possível identificar a sigla para a conversão, verifique novamente!");
            }
        }

        System.out.println(" Informe a sigla da cotação para:");

        while(toCurrencyValue.length() != 3){

            toCurrencyValue = toCurrencyScanner.nextLine();

            if (toCurrencyValue.length() != 3) {
                System.out.println("Não foi possível identificar a sigla para a conversão, verifique novamente!");
            }
        }

        System.out.println(" Qual o valor:");

        while(searchValue <= 0){

            searchValue = Double.parseDouble(valueFromScanner.nextLine());

            if(searchValue <= 0){
                System.out.println("Não foi possível realizar o calculo, por favor informe um valor acima de 0.");
            }
        }


        double convertedAmount = calculate.calculate( fromCurrencyValue.toUpperCase(),toCurrencyValue.toUpperCase(), searchValue);

        if(convertedAmount > 0){
            System.out.println("O valor de " + searchValue + " " + fromCurrencyValue.toUpperCase() + " convertido para " + toCurrencyValue.toUpperCase() + " é equivalente há: " + String.format("%.2f", convertedAmount));
        }
    }
}