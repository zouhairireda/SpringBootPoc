package pocs.filters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "price.filter")
public class CityFilter {

	private List<String> cities = new ArrayList<>();

	public List<String> getCities() {
		return this.cities;
	}

	public boolean keep(String city) {
		return cities.contains(city);
	}
}
