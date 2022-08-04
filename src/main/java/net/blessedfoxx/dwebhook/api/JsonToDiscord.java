package net.blessedfoxx.dwebhook.api;

import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.OutputStream;
import java.net.URL;

public class JsonToDiscord {

    protected static void send(JSONObject jsonObject, URL url) throws Exception {

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.addRequestProperty("Content-Type", "application/json");
        connection.addRequestProperty("User-Agent", "Java-DWebhookAPI");
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");

//        InputStream inputStream = connection.getInputStream();
//        inputStream.read();
//        inputStream.close();
//
//        connection.getInputStream().close();
//        connection.disconnect();

        OutputStream stream = connection.getOutputStream();
        stream.write(jsonObject.toString().getBytes());
        stream.flush();
        stream.close();

        connection.getInputStream().close();
        connection.disconnect();
    }
}