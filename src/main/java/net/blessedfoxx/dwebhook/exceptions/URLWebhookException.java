package net.blessedfoxx.dwebhook.exceptions;

public class URLWebhookException extends RuntimeException {

    public URLWebhookException() {
        super("Error => Failed to set Webhook URL!");
    }
}