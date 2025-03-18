import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.List;

public class Main {
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet("https://api.nasa.gov/planetary/apod?api_key=xJCRiUiezkgBvk1xLyAp3E6XER74tFOmsVuHbqUJ");

        CloseableHttpResponse response = httpClient.execute(request);

        JSONPObject nasaResponses = (JSONPObject) response;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        NasaResponse object = gson.fromJson(String.valueOf(nasaResponses), NasaResponse.class);

        System.out.println(object);

//        nasaResponses.forEach(System.out::println);
    }
}


