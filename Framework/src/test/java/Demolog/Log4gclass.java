package 
import java.util.logging.LogManager;
import org.apache.logging.log4j.Logger;


//import com.sun.org.slf4j.internal.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4gclass {
	
	private static Logger logger = LogManager.getLogger(Log4gclass.class);
	

	public static void main(String[] args) {
	
		System.out.println("Hello world");
		logger.info("This is the message");
		logger.error("This is an error message");
		((java.util.logging.Logger) logger).warning("This is an warning message");
	}

}
