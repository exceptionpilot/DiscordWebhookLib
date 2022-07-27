package net.blessedfoxx.dwebhook.api;

import net.blessedfoxx.dwebhook.exeptions.PostWebhookException;
import net.blessedfoxx.dwebhook.exeptions.URLWebhookException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class DWebhookMessage {

    private static URL url;
    private static String content = null;
    private static String name = null;
    private static String avatar_url = null;
    private static boolean tts = false;

    public DWebhookMessage(String webhookURL) {

        try {

            url = new URL(webhookURL);


        } catch (MalformedURLException e) {
            throw new URLWebhookException();
        }

    }


    public DWebhookMessage setMessageContent(String message) {
        content = message;
        return this;
    }

    public DWebhookMessage setUsername(String username) {
        name = username;
        return this;
    }

    public DWebhookMessage setAvatar(String avatarURL) {
        avatar_url = avatarURL;
        return this;
    }

    public DWebhookMessage setTTS(boolean setTTS) {
        tts = setTTS;
        return this;
    }

    public void build() {

        try {

            JSONObject jsonObject = new JSONObject();


            if (content != null) {
                jsonObject.put("content", content);
            }

            if (name != null) {
                jsonObject.put("username", name);
            }

            if (avatar_url != null) {
                jsonObject.put("avatar_url", avatar_url);
            }

            jsonObject.put("tts", tts);

            JsonToDiscord.send(jsonObject, url);

            content = null;
            name = null;
            avatar_url = null;
            tts = false;

        } catch (Exception e) {
            throw new PostWebhookException();
        }
    }
}
