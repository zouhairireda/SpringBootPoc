package pocs.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Process implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Process.class);

	@Value("${files.in}")
	private String input;
	
	@Override
	public void run(String... args) throws Exception {
		LOG.info("Goooo!!!!");
		LOG.info("Fetching files from {}", input);
	}
	
	
}
