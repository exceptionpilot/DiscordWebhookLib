package net.blessedfoxx.dwebhook.exceptions;

public class PostWebhookException extends RuntimeException {

    public PostWebhookException() {
        super("Error => Failed method POST! Is Content 'null'?");
    }
}