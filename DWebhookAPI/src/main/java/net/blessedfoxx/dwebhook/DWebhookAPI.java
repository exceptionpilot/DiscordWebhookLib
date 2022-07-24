package net.blessedfoxx.dwebhook;

import net.blessedfoxx.dwebhook.api.DWebhookMessage;

public class DWebhookAPI {

    public DWebhookAPI() {

        /*
        @example : here u see how to use this small api :)
         */
        DWebhookMessage webhookMessage = new DWebhookMessage("https://discord.com/api/webhooks/1000756476903706644/pWP4k843rsrj6HuengJYTLTXwYNY32DmjNYFFRK8dKArAeRQKmAHa6vk0WRijGjdkuen");
        webhookMessage.setAvatar("https://cdn.discordapp.com/avatars/656913610584358935/a_af37918b9202106c1a5dcbbdeb0ae1a5.gif?size=512");
        webhookMessage.setUsername("DWebhook by Angekotzter");
        webhookMessage.setMessageContent("Version: 1.0");
        webhookMessage.setTTS(false);
        webhookMessage.build();

    }

}