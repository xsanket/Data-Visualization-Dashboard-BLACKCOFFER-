package com.dvdBackend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name= "Data")
public class DataEntity {
	
	@Id
	private Long id;

	private String end_year;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String url;
    private String region;
    private String start_year;
    private String impact;
    private String added;
    private String published;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private String title;
    private int likelihood;
    private String city;
    private double citylat;
    private double citylng;
    
   
    
	public DataEntity() {
		super();
	}

	public DataEntity(Long id, String endYear, int intensity, String sector, String topic, String insight, String url,
			String region, String startYear, String impact, String added, String published, String country,
			int relevance, String pestle, String source, String title, int likelihood, String city, double cityLat,
			double cityLng) {
		super();
		this.id = id;
		this.end_year = endYear;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.url = url;
		this.region = region;
		this.start_year = startYear;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.country = country;
		this.relevance = relevance;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
		this.city = city;
		this.citylat = cityLat;
		this.citylng = cityLng;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndYear() {
		return end_year;
	}

	public void setEndYear(String endYear) {
		this.end_year = endYear;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStartYear() {
		return start_year;
	}

	public void setStartYear(String startYear) {
		this.start_year = startYear;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCityLat() {
		return citylat;
	}

	public void setCityLat(double cityLat) {
		this.citylat = cityLat;
	}

	public double getCityLng() {
		return citylng;
	}

	public void setCityLng(double cityLng) {
		this.citylng = cityLng;
	}

	

	

}
