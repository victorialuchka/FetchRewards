package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try {
            String path = "src/test/resources/configuration.properties";

            //file reader
            FileInputStream inputStream = new FileInputStream(path);

            //load our properties file in a java Properties variable
            properties = new Properties();
            properties.load(inputStream);

            inputStream.close();

        } catch (IOException e) {
            //in case some issues come up we will know what happened
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }
}
