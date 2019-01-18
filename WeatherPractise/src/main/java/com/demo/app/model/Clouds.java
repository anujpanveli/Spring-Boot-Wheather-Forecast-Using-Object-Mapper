package com.demo.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {

	@JsonProperty
	public Integer all;

	public Integer getAll() {
		return all;
	}

	public void setAll(Integer all) {
		this.all = all;
	}
}
