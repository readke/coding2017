package com.leipengzj;
import java.util.HashMap;
import java.util.Map;

public class Configuration {

	static Map<String,String> configurations = new HashMap<>();
	static{
		configurations.put(ConfigurationKeys.SMTP_SERVER, "smtp.163.com");
		configurations.put(ConfigurationKeys.ALT_SMTP_SERVER, "smtp1.163.com");
		configurations.put(ConfigurationKeys.EMAIL_ADMIN, "admin@company.com");
	}
	/**
	 * 应该从配置文件读， 但是这里简化为直接从一个map 中去读
	 * @param key
	 * @return
	 */
	public String getProperty(String key) {
		
		return configurations.get(key);
	}

}

class ConfigurationKeys {

	public static final String SMTP_SERVER = "smtp.server";
	public static final String ALT_SMTP_SERVER = "alt.smtp.server";
	public static final String EMAIL_ADMIN = "email.admin";

}
