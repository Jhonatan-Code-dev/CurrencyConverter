package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioConversion {

    private final String apiKey = "93fc61ffc620f65229e37fe4";

    public String solicitarConversion(String base, String destino, double monto)
            throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/" + apiKey +
                "/pair/" + base + "/" + destino + "/" + monto;

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> respuesta =
                cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        return respuesta.body();
    }
}