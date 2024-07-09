import java.util.Map;

public class CalculateRate {

    public double calculate(String from, String to, double amount){
        CurrencyQuote currencyQuote = new CurrencyQuote();

        Map<String, Double> rates = currencyQuote.getCurrencyQuote(from).conversion_rates();

        if(rates == null || rates.get(to) == null){
            System.out.println("A sigla informada não foi encontrada, verifique novamente.");
            return 0;
        }

        double rate = rates.get(to);
        return amount * rate;

    }
}
