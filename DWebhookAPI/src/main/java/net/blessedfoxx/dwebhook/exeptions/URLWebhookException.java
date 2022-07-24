package net.blessedfoxx.dwebhook.exeptions;

public class URLWebhookException extends RuntimeException {

    public URLWebhookException() {
        super("Error => Failed to set Webhook URL!");
    }
}