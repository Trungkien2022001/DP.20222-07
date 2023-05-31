package utils;

import java.io.IOException;
import java.net.HttpURLConnection;

public class GetRequest extends ApplicationProgrammingInterface {
    @Override
    protected void setRequestMethod(HttpURLConnection conn) throws IOException {
        conn.setRequestMethod("GET");
    }

    @Override
    protected void setRequestHeaders(HttpURLConnection conn, String token) {
        conn.setRequestProperty("Authorization", "Bearer " + token);
    }

    @Override
    protected void setRequestBody(HttpURLConnection conn, String data) throws IOException {
        // No request body for GET requests
    }
}
