package basePack;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Log4j {

	public static Properties prop;
	 public static Logger APPLICATION_LOG = Logger.getLogger("devpinoyLogger");
	 
	 public static void inIt(){
	  if(prop ==null){
	   String path = System.getProperty("user.dir")+"/src/log4j.properties";
	   
	   prop = new Properties();
	   try {
	    FileInputStream fs = new FileInputStream(path);
	    prop.load(fs);
	   } catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	   }
	  }
	   
	 }
}
