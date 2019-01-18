package com.demo.app.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"temp",
"temp_min",
"temp_max",
"pressure",
"sea_level",
"grnd_level",
"humidity",
"temp_kf"
})
public class Main {

	public Integer getTemp() {
		return temp;
	}
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	public Integer getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Integer temp_min) {
		this.temp_min = temp_min;
	}
	public Integer getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Integer temp_max) {
		this.temp_max = temp_max;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getSea_level() {
		return sea_level;
	}
	public void setSea_level(Integer sea_level) {
		this.sea_level = sea_level;
	}
	public Integer getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(Integer grnd_level) {
		this.grnd_level = grnd_level;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Integer getTemp_kf() {
		return temp_kf;
	}
	public void setTemp_kf(Integer temp_kf) {
		this.temp_kf = temp_kf;
	}
	@JsonProperty
	public Integer temp;
	@JsonProperty
	public Integer temp_min;
	@JsonProperty
	public Integer temp_max;
	@JsonProperty
	public Integer pressure;
	@JsonProperty
	public Integer sea_level;
	@JsonProperty
	public Integer grnd_level;
	@JsonProperty
	public Integer humidity;
	@JsonProperty
	public Integer temp_kf;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	
}
