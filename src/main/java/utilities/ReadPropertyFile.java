package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static Properties loadproperties()   {
		
		
        Properties p = new Properties();
        try {
			FileInputStream f = new FileInputStream("/Users/sarathkumar/eclipse-workspace/DSAlgo/src/test/resources/config/config.properties");
			try {
				p.load(f);
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	return p;
        
	}

}
