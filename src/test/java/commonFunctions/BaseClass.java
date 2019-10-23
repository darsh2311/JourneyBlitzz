package commonFunctions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {

	public static Properties property;

	public static String getValueFromPropertyFile(String filename, String key) {
		property = new Properties();

		InputStream inputStream = BaseClass.class.getClassLoader().getResourceAsStream(filename);
		try {
			property.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);

	}
}
