package netbiis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioRequisicaoClienteHTTP {
    public static void main(String[] args) {
        // Criando um novo cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        // Fazendo a leitura de uma url
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira uma url válida (Insira https://):  ");
        String url = teclado.next();

        // Fazendo uma requisição http
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(url)).build();

        // Enviado uma requisicao assíncrona através do cliente
        cliente.sendAsync(requisicao, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }
}
