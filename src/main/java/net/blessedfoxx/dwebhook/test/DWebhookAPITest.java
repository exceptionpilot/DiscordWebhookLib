package net.blessedfoxx.dwebhook.test;

import net.blessedfoxx.dwebhook.api.DWebhookMessage;
import net.blessedfoxx.dwebhook.api.events.WebhookEvent;

class DWebhookAPITest implements WebhookEvent {

    protected DWebhookAPITest() {



        /*
        @example : here u see how to use this small api :)
         */

        // DWebhookAPI.addListener(Your Class :D);

        DWebhookMessage webhookMessage = new DWebhookMessage("WEBHOOK LINK HERE!");
        webhookMessage.setAvatar("https://cdn.discordapp.com/avatars/656913610584358935/a_af37918b9202106c1a5dcbbdeb0ae1a5.gif?size=512");
        webhookMessage.setUsername("DWebhook by Angekotzter");
        webhookMessage.setMessageContent("Version: 1.2");
        webhookMessage.setTTS(false);
        webhookMessage.build();
    }

    @Override
    public void onWebhookPerform() {
        // Do something...
    }
}