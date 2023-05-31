package utils;

import utils.ApplicationProgrammingInterface;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.util.logging.Logger;

public class PostRequest extends ApplicationProgrammingInterface {
    private String payload;
    private Logger LOGGER;

    public PostRequest(String payload, Logger LOGGER) {
        this.payload = payload;
    }

    @Override
    protected void setRequestMethod(HttpURLConnection conn) throws IOException {
        allowMethods("PATCH");
        conn.setRequestMethod("PATCH");
    }

    @Override
    protected void setRequestHeaders(HttpURLConnection conn, String token) throws IOException {
        // No additional headers needed for PATCH requests
    }

    @Override
    protected void setRequestBody(HttpURLConnection conn, String data) throws IOException {
        String payload = this.payload;
        LOGGER.info("Request Info:\nRequest URL: " + conn.getURL() + "\nPayload Data: " + payload + "\n");

        Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
        writer.write(payload);
        writer.close();
    }
}

