package apiLivros;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner imput = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();

        System.out.println("digite o nome do filme");
        var filme = imput.nextLine().replace(" ", "+");

        String enderecoLivros = "http://www.omdbapi.com/?t=" + filme + "&apikey=3a411854";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoLivros))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
