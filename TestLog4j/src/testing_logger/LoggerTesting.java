package testing_logger;

import java.io.IOException;

import org.apache.log4j.*;
import org.apache.log4j.xml.XMLLayout;

public class LoggerTesting {
	private static Logger log = Logger.getLogger(LoggerTesting.class.getName());

	public static void main(String[] args) throws IOException {

		/* Layout layout = new SimpleLayout(); */

//		Layout layout = new HTMLLayout();

//		Layout layout = new XMLLayout();

		Layout layout = new PatternLayout("%L %l %p %d %c [%m] %n %r ");

		Appender appender = new ConsoleAppender(layout);

		Appender a = new FileAppender(layout, "D:\\log4jtest\\log4j.log");

		log.addAppender(a);
		
		log.addAppender(appender);

		log.info("helo everyone");

		log.debug("debug program");

		log.info("info msg");

		log.warn("warn message ");

		log.error("error message");

		log.fatal("fatal message");

	}

}
