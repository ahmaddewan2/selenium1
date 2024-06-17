package utils;

import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	private Properties properties = new Properties();

	public Configuration() {
		loadProperty();
	}

	public void loadProperty() {
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}
	
	public String getProperties(String key) {
		return properties.getProperty(key);
		
	}

}
