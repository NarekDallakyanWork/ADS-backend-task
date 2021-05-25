package repository.impl;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import repository.DataRepository;

import java.util.Objects;

public class DataRepositoryImpl implements DataRepository {

    @Override
    public String getXmlData() {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("http://www.bindows.net/documentation/download/ab.xml")
                    .method("GET", null)
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (Exception e) {
            return null;
        }
    }
}
