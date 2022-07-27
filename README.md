# DiscordWebhookAPI

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
DWebhookMessage webhookMessage = new DWebhookMessage("YOUR WEBHOOK LINK!");
webhookMessage.setAvatar("LINK FOR UR AVATAR!");
webhookMessage.setUsername("DWebhook by Angekotzter");
webhookMessage.setMessageContent("Version: 1.0");
webhookMessage.setTTS(false);
webhookMessage.build();
```


**🧬 Maven:**
```mvm
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
   

<dependency>
    <groupId>com.github.BlessedFoxX</groupId>
    <artifactId>DiscordWebhookAPI</artifactId>
    <version>Tag</version>
</dependency>
```

**🧬 Gradle:**
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
   

	dependencies {
	        implementation 'com.github.BlessedFoxX:DiscordWebhookAPI:Tag'
	}
```

# 🆘 Support:
https://discord.gg/duhkBkJJQh
