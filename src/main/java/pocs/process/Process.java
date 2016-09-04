package pocs.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import pocs.model.Price;
import pocs.repo.PriceRepository;

@Component
@EnableMongoRepositories
public class Process implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Process.class);

	@Value("${files.in}")
	private String input;

	@Autowired
	private PriceRepository repository;

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Goooo!!!!");
		LOG.info("Fetching files from {}", input);

		repository.save(new Price("1000", "1000", "Rabat", "ok", null, "10"));
	}

}
