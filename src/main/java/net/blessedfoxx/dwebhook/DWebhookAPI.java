package net.blessedfoxx.dwebhook;

import net.blessedfoxx.dwebhook.api.DWebhookMessage;
import net.blessedfoxx.dwebhook.api.events.WebhookEvent;

public class DWebhookAPI {

    public static void addListener(WebhookEvent toAdd) {
        DWebhookMessage.listeners.add(toAdd);
    }
}