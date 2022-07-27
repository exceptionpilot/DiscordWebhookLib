# DiscordWebhookAPI
[![Release](https://jitpack.io/v/BlessedFoxX/DiscordWebhookAPI.svg)](https://jitpack.io/#BlessedFoxX/DiscordWebhookAPI)

**👨🏻‍🚀  About us:**

```
👨🏻‍💻 Developer: Sebastian Zängler (Angekotzter#8677)
⌛ Version: 1.0
👯 Partner: conri.se/blessedfoxx
   Official Partner for Cloud Hosting!
```

**📚 Example:**
```java
// Sending a Text Message with the API
DWebhookMessage webhookMessage = new DWebhookMessage("!YOUR WEBHOOK LINK!");
webhookMessage.setAvatar("max-mustermann.de/profil.png");
webhookMessage.setUsername("Max Mustermann");
webhookMessage.setMessageContent("Hello World!");
webhookMessage.setTTS(false);
webhookMessage.build();
```

**🧬 Maven:**
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
   

<dependency>
    <groupId>com.github.BlessedFoxX</groupId>
    <artifactId>DiscordWebhookAPI</artifactId>
    <version>Release Version</version>
</dependency>
```

**🔧 Gradle:**
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
  

dependencies {
        implementation 'com.github.BlessedFoxX:DiscordWebhookAPI:Release Version'
}
```

# 🆘 Support:
https://discord.gg/duhkBkJJQh
