package testing_logs;

import org.apache.log4j.Logger;

public class TestingLog {
	private static Logger log = Logger.getLogger(TestingLog.class.getName());

	public static void main(String[] args) {

		log.info("this is sujith");

		log.debug("sujith program");

		log.info("info msg");

		log.warn("warn message ");

		log.error("error message");

		log.fatal("fatal message");

	}

}
