package net.blessedfoxx.dwebhook.exeptions;

public class PostWebhookException extends RuntimeException {

    public PostWebhookException() {
        super("Error => Failed method POST! Is Content 'null'?");
    }
}