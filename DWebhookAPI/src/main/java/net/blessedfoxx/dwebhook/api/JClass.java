package net.blessedfoxx.dwebhook.api;

import java.util.HashMap;

public class JClass {

    public static class JSONObject {

        private final HashMap<String, Object> map = new HashMap<>();

        public void put(String key, Object value) {
            if (value != null) {
                map.put(key, value);
            }
        }
    }
}
