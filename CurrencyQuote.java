import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyQuote {

    public  ExchangeRate getCurrencyQuote(String fromQuote) {
        URI requestURL = URI.create("https://v6.exchangerate-api.com/v6/cbb403847e93b40141189e0c/latest/" + fromQuote);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(requestURL)
                .build();

        HttpResponse<String> response;

        try {
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), ExchangeRate.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter a cotação no momento.");
        }


    }
}
