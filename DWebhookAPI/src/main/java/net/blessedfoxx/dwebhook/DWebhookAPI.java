package net.blessedfoxx.dwebhook;

import net.blessedfoxx.dwebhook.api.DWebhookMessage;

public class DWebhookAPI {

    public DWebhookAPI() {

        /*
        @example : here u see how to use this small api :)
         */
        DWebhookMessage webhookMessage = new DWebhookMessage("your webhook");
        webhookMessage.setAvatar("https://cdn.discordapp.com/avatars/656913610584358935/a_af37918b9202106c1a5dcbbdeb0ae1a5.gif?size=512");
        webhookMessage.setUsername("DWebhook by Angekotzter");
        webhookMessage.setMessageContent("Version: 1.0");
        webhookMessage.setTTS(false);
        webhookMessage.build();

    }

}
