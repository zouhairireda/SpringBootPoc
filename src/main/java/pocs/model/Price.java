package pocs.model;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.MoreObjects;

import pocs.process.Process;

public class Price {
	
	private static final Logger LOG = LoggerFactory.getLogger(Price.class);

	private double[] loc;
	private String ville;
	private String type;
	private Date date;
	private double prix;

	public Price() {
		super();
	}

	public Price(String longitude, String latitude, String ville, String type, Date date, String priceValue) {
		super();
		double x = Double.parseDouble(longitude) / 100_000;
		double y = Double.parseDouble(latitude) / 100_000;
		setLoc(new double[] { x, y });

		this.ville = ville;
		this.type = type;
		this.date = date;
		this.prix = Double.parseDouble(priceValue) / 1_000;
		
		LOG.info("Created!!!!!");
	}

	public double[] getLoc() {
		return loc;
	}

	public void setLoc(double[] loc) {
		this.loc = loc;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return MoreObjects.toStringHelper(this).add("loc", loc).add("ville", ville).add("type", type).add("date", date)
				.add("prix", prix).toString();
	}

}
