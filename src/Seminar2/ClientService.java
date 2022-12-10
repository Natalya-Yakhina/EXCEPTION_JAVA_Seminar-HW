package Seminar2;

public class ClientService {
    HttpClient client = HttpClient.newBuilder().build();

    public String get(String sourceUrl) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest // строим запрос
                .newBuilder()
                .url(new URI(sourceUrl))
                .GET()
                .build();
//        String filename = sourceUrl.substring(sourceUrl.lastIndexOf('/') + 1)

        HttpResponse<String> response;
        try {
            response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {

        }

        if (response.statusCode() != 200) {
            throw new RuntimeException("Ошибка при скачивании");
        }

        System.out.println(response.body());
        return response.body();
    }
}
